package com.mitinyova.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.mitinyova.entities.Subject;
import com.mitinyova.interfaces.SubjectsDao;

@Transactional(propagation= Propagation.SUPPORTS, readOnly = true)

public class SubjectsWorker {
	@Autowired
	private TransactionTemplate transactionTemplate;
	@Autowired
	SubjectsDao subjectsDao;

	public Subject addSubject(final Subject subject) {
		transactionTemplate.execute(new TransactionCallback<Void>() {

			public Void doInTransaction(TransactionStatus txStatus) {
				try {
					subjectsDao.addSubject(subject);
					System.out.println("Subject has been added "+subject);
				} catch (RuntimeException e) {
					txStatus.setRollbackOnly();
					throw e;
				}
				return null;
			}
		});
		return subject;
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
    public void saveSubject(Subject subject){
		subjectsDao.saveSubject(subject);
        System.out.println("Subject has been saved "+subject);
    }
}

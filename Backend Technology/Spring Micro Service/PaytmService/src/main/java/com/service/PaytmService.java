package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Paytm;
import com.dao.PaytmDao;

@Service
public class PaytmService {

	@Autowired
	PaytmDao paytmDao;
	
	@Autowired
	RestTemplate restTemplate;		// RestTemplate provide set of method 
										// which help to call other service or micro service 
	
	public String findAccounBalance(int pid) {
			Optional<Paytm> op = paytmDao.findById(pid);
			if(op.isPresent()) {
				Paytm pm  = op.get();
				if(pm.getAccno()==null) {
					return "Paytm account not link with any bank account";
				}else {
				String result = restTemplate.getForObject("http://ACCOUNT-SERVICE:8383/account/findAccountDetails/"+pm.getAccno(), String.class);
				return result;
				}
			}else {
				return "Paytm account not exists";
			}
	}
	
}

package com.example.demo.charter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Response;

@Service
public class PurchaseService {

	public List<Response> getRewards(List<Response> list) {
		List<Response> finalList = new ArrayList<Response>();

		for (Response resp : list) {
			if (resp.getTotalSpent() > 50 && resp.getTotalSpent() <= 100) {

				resp.setRewardpoints((resp.getTotalSpent() - 50) * 1);
				System.out.println(resp.getTotalSpent());
			} else if (resp.getTotalSpent() > 100) {

				resp.setRewardpoints(((resp.getTotalSpent() - 100) * 2) + 50);

			} else {
				resp.setRewardpoints(0);
			}
			finalList.add(resp);
		}
		
		return finalList;

	}
}

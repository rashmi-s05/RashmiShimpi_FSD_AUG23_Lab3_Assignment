package com.gl.labsession3.tree.main;

import com.gl.labsession3.tree.service.FindSumPair;
import com.gl.labsession3.tree.service.Node;

public class Driver {

	public static void main(String[] args)
	{
		Node root = null;
		
		FindSumPair findSP = new FindSumPair();
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);

		int sum = 130;
		findSP.findPairWithGivenSum(root, sum);
	}
}
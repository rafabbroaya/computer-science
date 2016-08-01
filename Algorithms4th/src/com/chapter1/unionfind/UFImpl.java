package com.chapter1.unionfind;

public class UFImpl implements UF {

	private int[] id; // access to component id (site indexed)
	private int count; // number of components

	public UFImpl(int N) {
		// initialize component array
		this.count = N;
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	@Override
	public void union(int p, int q) {

		// Quick-find implementation
		// Put p and q into the same component.
		// int pID = find(p);
		// int qID = find(q);
		// Nothing to do if p and q are already in the same component.
		// if (pID == qID)
		// return;
		// Change values from id[p] to id[q].
		// for (int i = 0; i < id.length; i++)
		// if (id[i] == pID)
		// id[i] = qID;
		// count--;

		// Quick-union implementation
		// Give p and q the same root.
		int i = find(p);
		int j = find(q);
		if (i == j)
			return;
		id[i] = j;
		count--;

	}

	@Override
	public int find(int p) {
		// TODO Auto-generated method stub
		// Quick-find implementation
		// return id[p];
		// Quick-union implementation
		while (p != id[p])
			p = id[p];
		return p;
	}

}

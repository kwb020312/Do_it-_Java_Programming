package collection.treeset;

import java.util.TreeSet;

public class treeset {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}

package package_section_2_1;

public class Student implements Comparable<Student> {

	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// 定义student的compareTo函数
	// 如果分数相等，则按照名字的字母序列排序
	// 如果分数不等 分数高的靠前
	@Override
	public int compareTo(Student that) {
		if (this.score == that.score)
			return this.name.compareTo(that.name);
		else if (this.score < that.score)
			return 1;
		else if (this.score > that.score)
			return -1;
		else
			return 0;
	}

	// 定义student类输出的打印实例
	@Override
	public String toString() {
		return "学生姓名为：" + this.name + " " + "学生分数为：" + this.score;
	}

}

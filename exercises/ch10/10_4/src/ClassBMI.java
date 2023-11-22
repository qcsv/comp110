public class ClassBMI
{
	public static void main(String[] args)
	{
		BMI Client1 = new BMI("George", 45, 100, 6);
	}
}
class BMI 
{
	private String name;
	private int age;
	private double weight;
	private double height;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH  = 0.0254;
	BMI(String name, int age, double weight, double height)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	BMI(String name, double weight, double height)
	{
		this(name, 20, weight, height);
	}
	double getBMI()
	{
		double bmi = weight * KILOGRAMS_PER_POUND / (( height * METERS_PER_INCH * (height * METERS_PER_INCH)));
		return Math.round(bmi * 100 / 100.0);
	}
	String getStatus()
	{
		double bmi = getBMI();
		if (bmi < 18.5)
		{
			return "Underweight";
		}
		else if (bmi < 25)
		{
			return "Normal";
		}
		else if (bmi < 30)
		{
			return "Overweight";
		}
		else
		{
		return "Obese";
		}
	}


}

public class Student
{

        String name;//instance variable
        int Roll_No;
        double[]marks=new double[5];
        void allotment(double maths,double sci,double hin,double geo,double eng,double avg)
        {
            avg=(maths+sci+hin+geo+eng)/5;//calculating the average
            if(avg>=90)
            {
                System.out.println("Science with Computers");
            }
            else if((avg>=80)&&(avg<90))
            {
                System.out.println("Science without Computers");
            }
            else if((avg>=70)&&(avg<80))
            {
                System.out.println("Commerce with Maths");
            }
            else if((avg>=60)&&(avg<70))
            {
                System.out.println("Commerce without Maths");
            }
            else
            {
                System.out.println("No stream");
            }
        }
    }

            
            
            
            
        
/*
Design a java class for method overloading.
*/
// Source : http://www.careerride.com/java-method-overloading-and-overriding.aspx



class OverloadDemo
{
         void triangleArea(float base, float height)
         {
               float area;
               area = base * height / 2.0f;
               System.out.println(“Area = “ + Area);
         }

         void triangleArea(float side1, float side2, float side3) 
         {
                  float area,s;
                  s = (side1 + side2 + side3) / 2.0; 
                  area = Math.sqrt(s*(s-side1) * (s-side2) * (s-side3) );
                  System.out.println(“Area = “ + area);
         }
}

class MainOverloadDemo
{
            public static void main(String args[])
            {
                    OverloadDemo ovrldDemo = new OverloadDemo(); 
                    ovrldDemo.triangleArea(20.12,58.36);
                    ovrldDemo triangleArea(63.12,54.26,95.24);
            }
}

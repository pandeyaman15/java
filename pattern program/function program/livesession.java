

public class livesession {
        public static void printPattern(int n){
            int total_number_of_line = n;
    
            int spaces = n-1;
            int stars = 1;
    
            int current_number_of_line = 1;
    
            while(current_number_of_line <= total_number_of_line){
                // print spaces
                for(int i=1; i<=spaces; i++){
                    System.out.print("  ");
                }
    
                // print stars
                for(int i=1; i<=stars; i++){
                    System.out.print("* ");
                }
    
    
                // prepare for next line 
                System.out.println();
                current_number_of_line++;
                spaces--;
                stars++;
            }
        }
    
        public static void butterFlyPattern(int n){
            int total_number_of_line = 2*n-1;
    
            int stars = 1;
            int spaces = 2*n-2;
    
            int current_number_of_line = 1;
            
            while(current_number_of_line <= total_number_of_line){
                // print stars  
                for(int i=1; i<=stars; i++){
                    System.out.print("* ");
                }
    
                // print spaces
                for(int i=1; i<=spaces; i++){
                    System.out.print("  ");
                }
    
                // print stars
                for(int i=1; i<=stars; i++){
                    System.out.print("* ");
                }
    
                // prepare for next line
                System.out.println();
                if(current_number_of_line < n){
                    stars++;
                    spaces = spaces - 2;
                } else {
                    stars--;
                    spaces = spaces + 2;
                }
                current_number_of_line++;
            }
        }
    
        public static void numberPyramid(int n){
            int total_number_of_line = n;
            int stars = 1;
            int spaces = n-1;
    
            int current_number_of_line = 1;
    
            while(current_number_of_line <= total_number_of_line){
                // print spaces 
                for(int i=1; i<=spaces; i++){
                    System.out.print(" ");
                }
                // print stars
                for(int i=1; i<=stars; i++){
                    System.out.print(i+" ");
                }
    
                // prepare for next line 
                System.out.println();
                current_number_of_line++;
                stars++;
                spaces--;
            }
        }
    
        public static void pallidromePyramid(int n){
            int total_number_of_line = 2*n-1;
    
            int stars = 1;
            int spaces = n-1;
            int current_number_of_line = 1;
    
            while(current_number_of_line <= total_number_of_line){
                // print spaces
                for(int i=1; i<=spaces; i++){
                    System.out.print("  ");
                }
    
                // print stars
                int number_to_print = 1;
                for(int i=1; i<=stars; i++){
                    System.out.print(number_to_print + " ");
                    if(i <= stars/2){
                        number_to_print++;
                    } else {
                        number_to_print--;
                    }
                }
    
                // prepare for next line 
                System.out.println();
                if(current_number_of_line < n){
                    spaces--;
                    stars = stars+2;
                } else {
                    spaces++;
                    stars = stars-2;
                }
                current_number_of_line++;
            }
        }
    
        public static void main(String[] args) {
            int n = 5;
            pallidromePyramid(n);
            butterFlyPattern(n);
            numberPyramid(n);
            printPattern(n);
        }
    }


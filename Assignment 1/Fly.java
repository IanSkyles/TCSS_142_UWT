/*
 *Ian Skyles
 *TCSS 142 Summer 2014
 *Mr. Schuessler
 *TCSS Assignment1b 
 *Prints lyrics
 */
 
 /**
  *This program prints out lyrics of There Was An Old Woman
  *@Ian Skyles
  *@version June 29,2014
  */
  
  public class Fly {
        public static void main (String[] args) {
                
                //paragraph 1   
                System.out.print("There was an old woman who swallowed a fly,\n");
                p1();
                //pargraph 2
                System.out.print("\nThere was an old woman who swallowed a spider,\n");
                p2();
                //pargraph 3
                System.out.print("\nThere was an old woman who swallowed a bird,\n");
                System.out.print("How absurd! to swallow a bird,");
                p3();
                //pargraph 4
                System.out.print("\nThere was an old woman who swallowed a cat,\nImagine that! to swallow a cat,\n");
                p4p5();    
                //pargraph 5
                System.out.print("\nThere was an old woman who swallowed a dog,\nWhat a hog! to swallow a dog,\n");            
                System.out.print("She swallowed the dog to catch the cat,");
                p4p5(); 
                //paragraph 6
                System.out.print("\nThere was an old woman who swallowed a horse,\nShe's dead-of course!\n");
                }
                
        //prints verse 1 for p1        
        public static void p1 (){
               swallowed_fly();
               die();
               }
               
        //prints verse 2 (includes v1)   
        public static void p2 (){
               inside_her();
               catch_the_fly();
               p1();
               }        
               
        //prints verse 3 (includes v2)        
        public static void p3 (){
               spider();
               p2();
               }     
               
        //prints verse 4 (used in both p4 and p5) (includes v3)     
        public static void p4p5 (){
               bird();
               p3();
               }            
                
        //prints line of lyrics: I don't know why she swallowed a fly,
        public static void swallowed_fly() {
                System.out.println("I don't know why she swallowed a fly,");
                }
        //prints line of lyrics: Perhaps she'll die
        public static void die() {
                System.out.println("Perhaps she'll die.");
                }
                
        //prints line of lyrics: She swallowed the spider to catch the fly
        public static void catch_the_fly () {
                System.out.println("She swallowed the spider to catch the fly,");
                }
                
       //prints line of lyrics: That wriggled and jiggled and tickled inside her,
       public static void inside_her () {
                System.out.println("That wriggled and jiggled and tickled inside her,");
                }
                
       //prints line of lyrics: She swallowed the bird to catch the spider,
       public static void spider () {
                System.out.println("She swallowed the bird to catch the spider,");
                }

       //prints line of lyrics: She swallowed the cat to catch the bird
       public static void bird () {
                System.out.println("She swallowed the cat to catch the bird,");
                }
                
 }
       
                
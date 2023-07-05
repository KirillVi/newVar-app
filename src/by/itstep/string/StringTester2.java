package by.itstep.string;

import javafx.scene.text.Text;

import java.util.Locale;
import java.util.StringTokenizer;

public class StringTester2 {
    public static void main(String[] args) {
        //String pool

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Java";

        System.out.println(s1==s2);
        System.out.println(s2==s3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        //Heap storage(not pool)
        String s4 = new String("Java");

        System.out.println(s1==s4);
        System.out.println(s2==s4);

        String s5 = new String("Java");

        System.out.println(s4==s5);

        String text = "Java is a programming language originally developed by Sun Microsystems and released " +
                "in 1995 as a core component of Sun's Java platform. The language derives much of its Syntax from " +
                "C and C++ but has a simpler object model and fewer low-level facilities. Java applications are " +
                "typically compiled to bytecode which can run on any Java virtual machine (JVM) regardless of computer architecture.\n" +
                "\n" +
                "The original and reference implementation Java compilers, virtual machines, and class" +
                " libraries were developed by Sun from 1995. As of May 2007, in compliance with the specifications of the Java Community Process," +
                " Sun made available most of their Java technologies as Virtual Machine under the GNU General Public License. " +
                "Others have also developed alternative implementations of these Sun technologies, " +
                "such as the GNU Compiler for Java and GNU Classpath.\n" +
                "\n" +
                "Java's design, industry backing and portability have made Java one of the fastest-growing and" +
                " most widely used programming languages in the modern computing industry.Template:Fact";

        int wordsCounts = 0;
        for(String word: text.replace("\n"," ").split(" ")){
            System.out.println(word);
            wordsCounts++;
        }
        System.out.println("Word counter is " + wordsCounts);

        StringTokenizer stringTokenizer = new StringTokenizer(text);
        int wordsCounts2 = stringTokenizer.countTokens();
        System.out.println("Words counts 2 = " + wordsCounts2);


        //count specific words

        String search = "1995";
        int searchCounter = 0;
        for(String word : text.toLowerCase().split("\\s++")){
            if(word.startsWith(search.toLowerCase())){
                searchCounter++;
            }
        }
        System.out.println("Search " + search + " : " + searchCounter);

        //replace
        text =text.replace("Java","C ++");
        System.out.println(text);
        System.out.println("______");
        System.out.println(text.substring(44));
        System.out.println("______");
        System.out.println(text.substring(15, 25));

        String subText = text.substring(text.indexOf(search));
        System.out.println(subText);







    }
}

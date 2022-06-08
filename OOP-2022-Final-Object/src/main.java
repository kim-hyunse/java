import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class main {
	public static void main(String[] args) throws IOException

	{

String fileName = "record.dat";

 Species s1 = new Species("8Condor", 27, 0.02);

 Species s2 = new Species("Rhino", 100, 1.0);

	                                         

 FileOutputStream fos = new FileOutputStream(fileName);

 ObjectOutputStream  outs = new ObjectOutputStream (fos);

	                                         

	    outs. writeObject(s1);

	    outs.writeObject(s2);

	                                        outs.close();

	                                         

	                                        FileInputStream fin = new FileInputStream(fileName);

	                                        [(d)응답
	                                        Scanner
	                                        틀림


	                                        ]  ins = new [  ==(d)==   ] (fin);

	                                         

	                                        Species p1 = [(e)응답
	                                        (Species)ins.ReadObject
	                                        정답


	                                        ]();

	                                        Species p2 = [              ==(e)==             ];

	                                         

	                                        System.out.println(p1);

	                                        System.out.println(p2); 

	                                        ins.close();

	                                        }

}

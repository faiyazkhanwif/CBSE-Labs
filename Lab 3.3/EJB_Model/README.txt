      ABOOK       KCODAB    ODABOOK           ABO       OOKCODABOO      OOKCOD       DABOOK    BOOKCO   OOK    
    CODABOOKCO   OOKCODAB   CODABOOKC        ODABO      BOOKCODABOO    ABOOKCOD     CODABOOK   ABOOK    BOO    
   OKC   BOOKC  ABOO  ODAB  KCODABOOKC       CODAB      ABOOK   ABO   ODAB  KCOD   OKCO  BOOK   ABO    DA      
  BOO     BOOK  DAB    ODA  OKCO   OOKC     OKCODA        BOO   DAB   COD    KCO   OOK    BOO   DAB   CO       
  ABO          CODA    CODA  OKC   BOOK     OOK ODA       ABOOKCODA  OKCO    OKCO ABOO    ABOO  ODABOOK        
  DA           KCOD    KCOD  OOK    BOO    ABOOKCODA      DABOOKCODA OOKC    OOKC DABO    DABO  CODABOO        
  OD            KCO    OKC   BOO   DABO    DABOOKCOD      ODABOOKCODA OOK    BOO   DAB    ODA   KCODABO        
  CO       OD   OKC    OOK  DABO  CODAB   CODA   KCOD     COD    KCOD BOO    ABO   ODA    COD   OKC  ABO       
  KCO     KCO   OOKC  ABOO CODABOOKCODA   KCO     KCO     KCODABOOKCO ABOO  ODAB   CODA  OKCO   OOK  DAB       
   KCODABOOKC    OOKCODAB  KCODABOOKCO  BOOKCO   OOKCOD BOOKCODABOOK   ABOOKCOD     CODABOOK   ABOOK ODABOOK   
    KCODABO       OOKCOD   OKCODABOO    ABOOKC   BOOKCO ABOOKCODABO     ABOOKC       CODABO   ODABOO CODABOO   




*********************************************************************************************
* COMPANION CODE FOR THE BOOK “Component Oriented Development & Assembly – CODA Using Java” *
* AUTHORS – Piram Manickam, Sangeetha S, Subrahmanya S V                                    *
* REFERENCE – http://www.codabook.com                                                       *
* CODE CONTRIBUTORS – SangeethaS				                            *
********************************************************************************************* 

1. The zip file you downloaded contains this README file and the source code for the example in Section 3.3 of the book (in Netbeans version 7.2 project format).

2. Extract the zip file to a new local folder on your machine. Let's name this folder - 'EJB_Model'. The folder should contain:
	- AgeCalculatorEJB
	- AgeCalculatorEJBClient
	- README.txt

3. You can import and execute the projects from Netbeans IDE using steps given below. Alternatively, you can inspect the source code by exploring the *.java files inside the zip file.


Importing and Running Netbeans Project(s):
-----------------------------------------

1. Choose 'File' -> 'Open Project' from Netbeans.

2. From the 'Open Project' dialog, browse to the folder 'EJB_Model'.

3. After scanning the folder, Netbeans will show following projects available to open:
	- AgeCalculatorEJB
	- AgeCalculatorEJBClient

4. Select both the projects and click on 'Open Project'.
   
5. Right click on project 'AgeCalculatorEJB'. Choose 'Clean and Build' from the pop-up. Do the same for the project 'AgeCalculatorEJBClient'.

6. Open the Services Tab from Netbeans, and expand the servers. If you already have a configured glassfish server, then you can skip this step, and go directly to step-7, otherwise you have to go through the following steps first in order to setup the server:

   - Right click on the project 'AgeCalculatorEJB' and choose 'Resolve Missing Server Problem'.
   - Click on 'Add Server'. Select 'Glassfish Server 3+' and click on 'Next'.
   - Browse till the directory where the 'glassfish server 3.1' or above is installed. Click on 'Next'.
   - Give a domain name under 'Register Local Domain'. You can either choose  an existing domain from the drop-down or you can give it a new domain name for eg. 'pos_domain'. Click on 'Finish'.
   - Click on 'Ok' from the dialog.
   - Click on the project 'AgeCalculatorEJBClient' and choose 'Resolve Missing Server Problem'.
   - Select the 'Glassfish server 3+'. This is the server you just configured. Click on 'Ok'

7. Right click on the project 'AgeCalculatorEJB' and choose 'Deploy'. Netbeans will start the glassfish server and deploy the application on it. This can take some time.

8. Now to run the application, right click on the project 'AgeCalculatorEJBClient', and select 'Run'. The application will start running.

9. Use the application as guided by the text displayed on the Netbeans console.
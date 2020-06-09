/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;


//LIBRARIES WE ARE USING FOR OUR PROJECTS
//STREAMS LIBRARY
//JAVAFXLIBRARY
//OPTIONPANE LIBRARY
//SCENE LIBRARY
//JAVA.UTIL.* LIBRARIES AND SO ON....

import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.swing.JOptionPane;

/**
 *
 * @author Zainab Ghauri
 */



//OOP CONCEPTS ARE USED HERE !!
//!.INHERITANCE
//2.MULTIPLE INHERITANCE
//OOP DOESN'T ALLOWS US MULTIPLE INHERITANCE SO IT CAN BE DONE USING INTERFCES USING IMPLEMENTS KEYWORD!!
//IT ALSO INHERITS ABSTRACT CLASS USING " EXTENDS " KEYWORD !!

public class FXMLDocumentController extends LogInMenuScreen  implements Initializable , loadingStage , start , QuitDecison , signupscreenDecision 
{

    //FXML CONTROLS 
    //THESE NAMES ARE SAME AS IT IS USED IN SCENE BUILDER FX ID
    
     @FXML   public AnchorPane ap;
     @FXML   private Button btnproceed;
     @FXML   private TextField emailid; 
     @FXML   private TextField txtServerMessage;
     @FXML   private PasswordField passid;
     @FXML   private Button btnlogin;
     @FXML   private Button btnInstruct;
     @FXML   private Button btnreturn;
     @FXML   private Button btncancel;
     @FXML   private Button btnyes;
     @FXML   private Button btnno;
     @FXML   private Button btnsubmit;
     @FXML   private Label labelsign;
     @FXML   private TextField firstname;
     @FXML   private TextField signemail;
     @FXML   private TextField lastname;
     @FXML   private TextField username;
     @FXML   private PasswordField passwordsign;
     @FXML   private Button btnreg;
     @FXML   private Button btncancelsign;
     @FXML   private Button btnstart;
     @FXML   private Button labellogin;
     @FXML   private Button btnsent;
     @FXML   private ListView servermsg;
     @FXML   private ListView clientmsg;
     @FXML   private Button btnblock;
     @FXML   private Button btnleave;
     @FXML   private Button btnblockno;
     @FXML   private Button btnblockyes;
     @FXML   private Button btnhint;
     @FXML   private TextField btnnameofserver;
     @FXML   private TextField btnComment;
     @FXML   private Button btnsibmitButton;
     @FXML   private Button btnServerMessage;
     @FXML   private Button lastfeedback;
     @FXML   private Button btnlast;
     //@FXML   private Button btnsibmitButton;
     
////    Unccomment if you want to run the multi user application    
////    Arraylis isused here to handle the multi-clients if needed :    
////    private static ArrayList<theHanlderOne> clients = new ArrayList<> ();
////    The executor pool is used to carry operation more than 1 at a time , it maintins the network of more than 1 clients 
///     to a server at a same time , the argument in .newFixedThreadPool() shows the number of operation it can take successfully !
////    private static ExecutorService pool = Executors.newFixedThreadPool(4);
     
     
     
     //GETTER AND SETTER METHODS
     //GETTER AND SETTER METHOD IS FOR DATA PROTECTION AND CREATED SPECIALLY FOR PRIVATE FIELDS AND DATA VARIABLE
     //THIS REMAIN ACCESSABLE TILL IT IS IN THE SAME CLASS
     //IF IT IS NEEDED TO BE USED IN ANOTHER CLASS , IT CAN BE ACCESSED THROUGH CONSTRUCTORS AND GETTER METHODS!
     
    public AnchorPane getAp() {
        return ap;
    }

    public void setAp(AnchorPane ap) {
        this.ap = ap;
    }

    public Button getLastfeedback() {
        return lastfeedback;
    }

    public void setLastfeedback(Button lastfeedback) {
        this.lastfeedback = lastfeedback;
    }

    public Button getBtnlast() {
        return btnlast;
    }

    public void setBtnlast(Button btnlast) {
        this.btnlast = btnlast;
    }

    
    
    public Button getBtnproceed() {
        return btnproceed;
    }

    public void setBtnproceed(Button btnproceed) {
        this.btnproceed = btnproceed;
    }

    public TextField getEmailid() {
        return emailid;
    }

    public void setEmailid(TextField emailid) {
        this.emailid = emailid;
    }

    public TextField getTxtServerMessage() {
        return txtServerMessage;
    }

    public void setTxtServerMessage(TextField txtServerMessage) {
        this.txtServerMessage = txtServerMessage;
    }

    public PasswordField getPassid() {
        return passid;
    }

    public void setPassid(PasswordField passid) {
        this.passid = passid;
    }

    public Button getBtnlogin() {
        return btnlogin;
    }

    public void setBtnlogin(Button btnlogin) {
        this.btnlogin = btnlogin;
    }

    public Button getBtnInstruct() {
        return btnInstruct;
    }

    public void setBtnInstruct(Button btnInstruct) {
        this.btnInstruct = btnInstruct;
    }

    public Button getBtnreturn() {
        return btnreturn;
    }

    public void setBtnreturn(Button btnreturn) {
        this.btnreturn = btnreturn;
    }

    public Button getBtncancel() {
        return btncancel;
    }

    public void setBtncancel(Button btncancel) {
        this.btncancel = btncancel;
    }

    public Button getBtnyes() {
        return btnyes;
    }

    public void setBtnyes(Button btnyes) {
        this.btnyes = btnyes;
    }

    public Button getBtnno() {
        return btnno;
    }

    public void setBtnno(Button btnno) {
        this.btnno = btnno;
    }

    public Button getBtnsubmit() {
        return btnsubmit;
    }

    public void setBtnsubmit(Button btnsubmit) {
        this.btnsubmit = btnsubmit;
    }

    public Label getLabelsign() {
        return labelsign;
    }

    public void setLabelsign(Label labelsign) {
        this.labelsign = labelsign;
    }

    public TextField getFirstname() {
        return firstname;
    }

    public void setFirstname(TextField firstname) {
        this.firstname = firstname;
    }

    public TextField getSignemail() {
        return signemail;
    }

    public void setSignemail(TextField signemail) {
        this.signemail = signemail;
    }

    public TextField getLastname() {
        return lastname;
    }

    public void setLastname(TextField lastname) {
        this.lastname = lastname;
    }

    public TextField getUsername() {
        return username;
    }

    public void setUsername(TextField username) {
        this.username = username;
    }

    public PasswordField getPasswordsign() {
        return passwordsign;
    }

    public void setPasswordsign(PasswordField passwordsign) {
        this.passwordsign = passwordsign;
    }

    public Button getBtnreg() {
        return btnreg;
    }

    public void setBtnreg(Button btnreg) {
        this.btnreg = btnreg;
    }

    public Button getBtncancelsign() {
        return btncancelsign;
    }

    public void setBtncancelsign(Button btncancelsign) {
        this.btncancelsign = btncancelsign;
    }

    public Button getBtnstart() {
        return btnstart;
    }

    public void setBtnstart(Button btnstart) {
        this.btnstart = btnstart;
    }

    public Button getLabellogin() {
        return labellogin;
    }

    public void setLabellogin(Button labellogin) {
        this.labellogin = labellogin;
    }

    public Button getBtnsent() {
        return btnsent;
    }

    public void setBtnsent(Button btnsent) {
        this.btnsent = btnsent;
    }

    public ListView getServermsg() {
        return servermsg;
    }

    public void setServermsg(ListView servermsg) {
        this.servermsg = servermsg;
    }

    public ListView getClientmsg() {
        return clientmsg;
    }

    public void setClientmsg(ListView clientmsg) {
        this.clientmsg = clientmsg;
    }

    public Button getBtnblock() {
        return btnblock;
    }

    public void setBtnblock(Button btnblock) {
        this.btnblock = btnblock;
    }

    public Button getBtnleave() {
        return btnleave;
    }

    public void setBtnleave(Button btnleave) {
        this.btnleave = btnleave;
    }

    public Button getBtnblockno() {
        return btnblockno;
    }

    public void setBtnblockno(Button btnblockno) {
        this.btnblockno = btnblockno;
    }

    public Button getBtnblockyes() {
        return btnblockyes;
    }

    public void setBtnblockyes(Button btnblockyes) {
        this.btnblockyes = btnblockyes;
    }

    public Button getBtnhint() {
        return btnhint;
    }

    public void setBtnhint(Button btnhint) {
        this.btnhint = btnhint;
    }

    public TextField getBtnnameofserver() {
        return btnnameofserver;
    }

    public void setBtnnameofserver(TextField btnnameofserver) {
        this.btnnameofserver = btnnameofserver;
    }

    public TextField getBtnComment() {
        return btnComment;
    }

    public void setBtnComment(TextField btnComment) {
        this.btnComment = btnComment;
    }

    public Button getBtnsibmitButton() {
        return btnsibmitButton;
    }

    public void setBtnsibmitButton(Button btnsibmitButton) {
        this.btnsibmitButton = btnsibmitButton;
    }

    public Button getBtnServerMessage() {
        return btnServerMessage;
    }

    public void setBtnServerMessage(Button btnServerMessage) {
        this.btnServerMessage = btnServerMessage;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }

    public DataInputStream getIn() {
        return in;
    }

    public void setIn(DataInputStream in) {
        this.in = in;
    }

    public DataOutputStream getOut() {
        return out;
    }

    public void setOut(DataOutputStream out) {
        this.out = out;
    }

    public Component getFrame() {
        return frame;
    }

    public void setFrame(Component frame) {
        this.frame = frame;
    }

    public String getServerMessage() {
        return ServerMessage;
    }

    public void setServerMessage(String ServerMessage) {
        this.ServerMessage = ServerMessage;
    }

    //DEFAULT CONSTRUCTOR
    
    public FXMLDocumentController() {
 
    }

    
    //CONSTRUCTOR FOR THE BUTTONS
    //THIS KEYWORD IS USED HER E, IT IS USED IN THE SAME CLASS
    public FXMLDocumentController(Button btnproceed, Button btnlogin, Button btnInstruct, Button btnreturn, Button btncancel, Button btnyes, Button btnno, Button btnsubmit, Button btnreg, Button btncancelsign, Button btnstart, Button labellogin, Button btnsent, Button btnblock, Button btnleave, Button btnblockno, Button btnblockyes, Button btnhint, Button btnsibmitButton, Button btnServerMessage) {
        this.btnproceed = btnproceed;
        this.btnlogin = btnlogin;
        this.btnInstruct = btnInstruct;
        this.btnreturn = btnreturn;
        this.btncancel = btncancel;
        this.btnyes = btnyes;
        this.btnno = btnno;
        this.btnsubmit = btnsubmit;
        this.btnreg = btnreg;
        this.btncancelsign = btncancelsign;
        this.btnstart = btnstart;
        this.labellogin = labellogin;
        this.btnsent = btnsent;
        this.btnblock = btnblock;
        this.btnleave = btnleave;
        this.btnblockno = btnblockno;
        this.btnblockyes = btnblockyes;
        this.btnhint = btnhint;
        this.btnsibmitButton = btnsibmitButton;
        this.btnServerMessage = btnServerMessage;
    }

    
    //CONSTRUCTOR FOR THE  FIELDS

    public FXMLDocumentController(TextField emailid, TextField txtServerMessage, PasswordField passid, TextField firstname, TextField signemail, TextField lastname, TextField username, PasswordField passwordsign, TextField btnnameofserver, TextField btnComment) {
        this.emailid = emailid;
        this.txtServerMessage = txtServerMessage;
        this.passid = passid;
        this.firstname = firstname;
        this.signemail = signemail;
        this.lastname = lastname;
        this.username = username;
        this.passwordsign = passwordsign;
        this.btnnameofserver = btnnameofserver;
        this.btnComment = btnComment;
    }
    
    //CONSTRUCTOR FOR THE LABELS , LISTVIEWS AND PANES

    public FXMLDocumentController(AnchorPane ap, Label labelsign, ListView servermsg, ListView clientmsg, Component frame) {
        this.ap = ap;
        this.labelsign = labelsign;
        this.servermsg = servermsg;
        this.clientmsg = clientmsg;
        this.frame = frame;
    }
    
    
    
   //INITIALIZERS
   //initialize socket and input stream 
    
   //DECLARING SOCKET HERE AS NULL , A GLOBAL VARIABLE
   //SOCKET IS USED TO MAKE A CONNECTION WITH A CLIENT  
   private Socket          socket   = null; 
   //DECLARING SERVER SOCKET HERE,
   //SERVER SOCKET IS USED TO MAINTAIN A CONNECTION FOR A SERVER , THERE CORRESPONDING LIBRARIES ARE IMPORTED
    private ServerSocket    server   = null; 
   //DATAINPUTSTREAM  
    private DataInputStream in       =  null; 
   //DATAOUTPUTSTREAM ,JAVA APPLICATION GENERALLY USES THE DATA OUTPUT STREAM TO WRITE DATA THAT CAN LATER BE READ BY A DATA INPUT STREAM.
    private DataOutputStream out     = null; 
    
    //SCENEBUILDER STUFF
    private Component frame;
    //SERVERMESSAGE IS USED TO SEND MESSAGE TO CLIENT !
    String ServerMessage ="";

    
    
    @Override
    //OOPCONCEPT OF OVERRIDING IS USED HERE , IT IS A TYPE OF A POLYMORPHISM!
    //STARTMETHOD IS OVERRIDDEN
    public void Start()
       
     {
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
         btnproceed.setOnAction(e->{
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
     //LogInMenu.fxml file is put as a parameter in loadStage method that will appear a new stage
     loadStage("LogInMenu.fxml");
     
     Stage stage = ( Stage ) btnproceed.getScene().getWindow();
     
     
     });
     
     }
    
    
     public void lastQuit()
     
     {
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 

         btnleave.setOnAction(e->{

             //feedBack.fxml file is put as a parameter in loadStage method that will appear a new stage

             loadStage("feedBack.fxml");
         Stage stage = ( Stage ) btnproceed.getScene().getWindow();
     
     
     });
         
         
     }
    
     //THIS METHOD WILL BE CALLED WHEN THE SERVER CLICK THE BLOCK BUTTON AND IT POPS UP A NEW STAFE THAT SAYS THAT YOU REALLY WAN TO QUIT AND THE SERVER CLICK YES BUTTON
     public void backtoFirst()
     
     {
     
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
         
        btnblockyes.setOnAction(e->{
     //JOPTION PANE IS USED HERE , IT WILL SHOW A QUESTION MESSAGE THAT WILL DISPLAY THE TEXT WRITTEN BELOW IN ""
            final JOptionPane optionPane = new JOptionPane(
                    "You have blocked that Client \n"
                            + "Want to start Again ? \n",
                    JOptionPane.QUESTION_MESSAGE,
                    JOptionPane.YES_NO_OPTION);
 
//LogInMenu.fxml file is put as a parameter in loadStage method that will appear a new stage
//NOW A SERVER IS ALLOWED EITHER TO LEAVE OR START A NEW NETWORK WITH A NEW CLIENT
            loadStage("LogInMenu.fxml");
         Stage stage = ( Stage ) btnproceed.getScene().getWindow();
     
     
     });
            
         
     }
     
//THIS METHOD WILL BE CALLED WHEN THE SERVER CLICK THE BLOCK BUTTON AND IT POPS UP A NEW STAFE THAT SAYS THAT YOU REALLY WANT TO QUIT AND THE SERVER CLICK NO BUTTON

     public void backtoquit()
             
     {
         
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
         
        btnblockno.setOnAction(e->{
            
//ChatScreenSaver.fxml file is put as a parameter in loadStage method that will appear a new stage
//THE CONNECTION IS'NT DISTURBED , IT REMAINS CONNECTED STILL
            
         loadStage("ChatScreenServer.fxml");
            
         Stage stage = ( Stage ) btnproceed.getScene().getWindow();
     
         
         
     
     }); 
      
         
         
     }

    //THIS METHOD IS TO BLOCK THE CLIENT ,
     //ONLY THE SERVER HAS THE AUTHORITY TO BLOCK THE CLIENT BECAUSE IN SOCKET PROGRAMMING SERVER HAS THE AUTHORITY TO DO SO
     public void blockClient()
     
     {
         
         
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
         
          btnblock.setOnAction(e->{

              //blockclient.fxml file is put as a parameter in loadStage method that will appear a new stage
              //A NEW STAGE WILL APPEAR AND WHERE THERE ARE FURTHER OPTIONS TO PROCEED
              loadStage("blockclient.fxml");
              
         Stage stage = ( Stage ) btnproceed.getScene().getWindow();
     
     
     });
         
         
     }
     
     
     //OOPCONCEPT IS USED AGAIN HERE 
     //POLYMORPHISM-OVERRIDDING
     
    @Override
     public void leave()
     {
         
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
         
             btnyes.setOnAction(e->{
    
     //feedBack.fxml file is put as a parameter in loadStage method that will appear a new stage
     //FEEDBACK FORM WILL APPEAR , THIS FEEDBACK FORM IS NOT MANDATORY , SERVER CAN LEAVE JUST BY SUBMITTING IT!
             loadStage("feedBack.fxml");
       
             Stage stage = ( Stage ) btnproceed.getScene().getWindow();
     
     
     });
         
         
     }

     
     //OOPCONCEPT IS USED AGAIN HERE 
     //POLYMORPHISM-OVERRIDDING
     
     @Override
     public void move()
     {
     
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
        
          btnno.setOnAction(e->{ 
                   
              loadStage("LogInMenu.fxml");

      Stage stage = ( Stage ) btnproceed.getScene().getWindow();
  
                     
            
        });
         
         
         
     }
     
     
     
     public void endScene()
     {
       
       //  Window owner = btnlogin.getScene().getWindow();
      
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
      
         btnsibmitButton.setOnAction(e->{
  
     //THIS WILL SHOW A MESSAGE ON THE CONSOLE THAT YOU HAVE LEAVING SUCCESFULLY!
    JOptionPane.showMessageDialog(null, " !! LEAVING THE CHAT BOT SUCCESSFULLY !! \n !! THANKS FOR USING CHAT BOT !! \n");
 
     //AFTER RUNNING THE ABOVE LINE , IT WILL EXIT SUCCESSFULLY  AND BUILDSUCCESSFUL IS DISPLAYED ON THE CONSOLE
         System.exit(0);
         
         
     });
         
     }
     
     
     
     //OOPCONCEPT IS USED AGAIN HERE 
     //POLYMORPHISM-OVERRIDDING
     
     @Override
     public void starter()
     {
     //THIS LINE IS USED TO DECLARE A NEW WINDOW , THAT WILL SHOW THE MESSAGES WE ARE GOING TO USE IN NEXT IF STATEMENTS
         
         Window owner = btnlogin.getScene().getWindow();
      
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
     
         btnreg.setOnAction(e->{
     
             //IF THE firstname IS EMPTY AND USER CLICKS THE LOGIN BUTTON IT WILL SHOWS A MESSAGE OR YOU CAN SAY ALERT BOC THAT FIRST FILL IT T PROCEED
             //IT WILL NOT GOING TO PROCEED UNTIL ITS DONE!
             
             if(firstname.getText().isEmpty()) {
            
             //IT WILL CALL ANOTHER CLASS loginCc , WHERE ALL THE ALERTBOX AND IT LIBRARY IS IMPORTED AND FUNCTION IS WRITTEN
            
                 loginCc.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your First Name to proceed");
            //IT WILL SHOW THIS MESSAGE AND RETURN UNTIL ITS NOT DONE
                 return;
        }
             
             //IF THE lastname IS EMPTY AND USER CLICKS THE LOGIN BUTTON IT WILL SHOWS A MESSAGE OR YOU CAN SAY ALERT BOC THAT FIRST FILL IT T PROCEED
             //IT WILL NOT GOING TO PROCEED UNTIL ITS DONE!
             
        if(lastname.getText().isEmpty()) {
            
             //IT WILL CALL ANOTHER CLASS loginCc , WHERE ALL THE ALERTBOX AND IT LIBRARY IS IMPORTED AND FUNCTION IS WRITTEN
            
            loginCc.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your Last Name First to proceed");
            return;
        }
             
              //IF THE signemail IS EMPTY AND USER CLICKS THE LOGIN BUTTON IT WILL SHOWS A MESSAGE OR YOU CAN SAY ALERT BOC THAT FIRST FILL IT T PROCEED
              //IT WILL NOT GOING TO PROCEED UNTIL ITS DONE!
            
        if(signemail.getText().isEmpty()) {
            loginCc.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your Email First to proceed");
            return;
        }
           
              //IF THE username IS EMPTY AND USER CLICKS THE LOGIN BUTTON IT WILL SHOWS A MESSAGE OR YOU CAN SAY ALERT BOC THAT FIRST FILL IT T PROCEED
             //IT WILL NOT GOING TO PROCEED UNTIL ITS DONE!
            
        if(username.getText().isEmpty()) {
            loginCc.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your Username First to proceed");
            return;
        } 
             
             //IF THE passwordsign IS EMPTY AND USER CLICKS THE LOGIN BUTTON IT WILL SHOWS A MESSAGE OR YOU CAN SAY ALERT BOC THAT FIRST FILL IT T PROCEED
             //IT WILL NOT GOING TO PROCEED UNTIL ITS DONE!
            
        
       if(passwordsign.getText().isEmpty()) {
            loginCc.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your Password First to proceed");
            return;
        }
        
       //AFTER ALL THESE ABOVE STATEMENTS ARE EXECUTED AN NO FIELD IS EMPTY THIS STATEMENT WILL EXECUTE ,
       //THE LOADSTAGE METHOD WILL BE CALLED AND THE Connection.fxml File is run 
       
         loadStage("Connection.fxml");
         
         Stage stage = ( Stage ) btnproceed.getScene().getWindow();
     
     
     });  
         
         
     }

     //OOP CONCEPT USED HERE
     //POLYMORPHISM-OVERRIDING
     
      @Override
     public void quitpt2()
     {
         
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
     
         btncancelsign.setOnAction(e->{
        
      //THE LOADSTAGE METHOD WILL BE CALLED AND THE quitScreen.fxml File is run 
       
             loadStage("quitScreen.fxml");
       
             Stage stage = ( Stage ) btnproceed.getScene().getWindow();
     
     
     });
         
         
     }
    
     
     //OOP CONCEPT USED HERE
     //POLYMORPHISM-OVERRIDING
     
     @Override
     public void hintbox()
{
    
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
     
     btnhint.setOnAction(e->{

         //JOPTION MESSAGE PANE IS USED HERE
         //IT WILL SHOW THE HINT BOX WITH A MESSAGE , RELATED PASSWORD
    JOptionPane.showMessageDialog(frame,
    "** The Password is Your PortAddress (Loc*****t) ** ");
    
      //THE LOADSTAGE METHOD WILL BE CALLED AND THE LogInMenu.fxml File is run 
       
    loadStage("LogInMenu.fxml");
         Stage stage = ( Stage ) btnproceed.getScene().getWindow();
    
                            });
}

    
     
     //OOP CONCEPT USED HERE
     //POLYMORPHISM-OVERRIDING
     
     @Override
     public void textfill()
     {
     
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
         
     btnlogin.setOnAction( e->{
              Window owner = btnlogin.getScene().getWindow();

              
             //IF THE emailid IS EMPTY AND USER CLICKS THE LOGIN BUTTON IT WILL SHOWS A MESSAGE OR YOU CAN SAY ALERT BOC THAT FIRST FILL IT T PROCEED
             //IT WILL NOT GOING TO PROCEED UNTIL ITS DONE!

        if(emailid.getText().isEmpty()) {
            loginCc.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your Username First to proceed");
            return;
        }

              //IF THE passid IS EMPTY AND USER CLICKS THE LOGIN BUTTON IT WILL SHOWS A MESSAGE OR YOU CAN SAY ALERT BOC THAT FIRST FILL IT T PROCEED
             //IT WILL NOT GOING TO PROCEED UNTIL ITS DONE!

        if(passid.getText().isEmpty()) {
            loginCc.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your Password First to proceed");
            return;
        }
        
        if(passid.getText().equalsIgnoreCase("LocalHost")) {

            //THE LOADSTAGE METHOD WILL BE CALLED AND THE Connection.fxml File is run 

        
        loadStage("Connection.fxml");
        Stage stage = ( Stage ) btnproceed.getScene().getWindow();
       
        }
        
        
        else {
         
            loginCc.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Wrong Password , See hint !");
            return;
        }
//      
//        if(passid.getText()!="5000")
//             {
//                 loginCc.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
//                    "  Password is incorrect ! \n Try again or see hint ");
//            return; 
//                 
//             }
//    
       
     
     });
       
     }
     
     
     //OOP CONCEPT USED HERE
     //POLYMORPHISM-OVERRIDING
     
     
     @Override
     public void Details()
     {
     
         
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
     
         btnInstruct.setOnAction(e->
                 {
   
       //THE LOADSTAGE METHOD WILL BE CALLED AND THE Connection.fxml File is run 
       //INSTRUCTIONS INCLUDE MAIN POINTS HOW TO START THE NETWORK , HOW TO COMMUNICATE , HOW TO LINK ETC.
      loadStage("Instructions.fxml");

      Stage stage = ( Stage ) btnproceed.getScene().getWindow();
  
                     
                 });
         
         
     }
     
     
     
     //OOP CONCEPT USED HERE
     //POLYMORPHISM-OVERRIDING
     
     @Override
    public void quit()
    {
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
    
        btncancel.setOnAction(e->{ 
                   
             loadStage("quitScreen.fxml");

      Stage stage = ( Stage ) btnproceed.getScene().getWindow();
  
                     
            
        });
        
    }
    
    
     public void back()
     {
         
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
     
        btnreturn.setOnAction(e->{ 
                   
            loadStage("LogInMenu.fxml");

      Stage stage = ( Stage ) btnproceed.getScene().getWindow();
  
                     
            
        });
        
         }
     
     
    
    
    public void getStarted()
    {
        
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
    
      btnstart.setOnAction(e->{ 
                   
          loadStage("ChatScreenServer.fxml");

      Stage stage = ( Stage ) btnproceed.getScene().getWindow();
             
            
        });   
        
    }
    
     //OOP CONCEPT USED HERE
     //POLYMORPHISM-OVERRIDING
    
    //THIS IS THE MAIN LOGIC BEHIND OUR CODE
     //ALL THE LOGIC OF OUR CODE IS COMPRISED IN THIS METHOD
     
     public void ServerMsgClick() 
    
    {
        
        
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
     //THIS BUTTON IS USED TO SENT SERVER MESSAGE TO CLIENT AND DISPLAY IN GUI , LISTVIEW !!       
          
        btnServerMessage.setOnAction(e->{
           
              //IF-ELSE IS USED HERE
              //IF THE TEXT IN FIELD IS NULL , IT WILL NOT PROCEED , ONLY PROCEED IN CASE THERE IS SOM TEXT IN THE FIELD
        
              if(txtServerMessage.getText().equalsIgnoreCase("")== true){
            
                }else{
              //SERVER MESSAGE IS A PRIVATE STRING VARIABLE , THAT STORES THE DATA / TEXT IN A TEXTFIELD NAMED txtServerMessage
                  ServerMessage = txtServerMessage.getText();
                  //OUTPUTSTREAM IS DECLARED HERE , IT IS USED TO WRITE DATA AND THAT CAN BE LATER ON FETCH USING THE INPUT STREAM
                            OutputStream ostream = null; 
                            //ERROR HANDLING , ANOTHER OOP CONCEPT IS USED HERE!
                            //TRY-CATCH BLOCK IS USED HERE!
                            try {
                                //IT IS HERE USED TO MAINTAINS THE CONNECTION WITH THE CLIENT SOCKET
                                // 	BASICALLY WHAT OUTPUT STREAM IS CONCERNED WITH IT DEALS WITH WRITING
                                //, LIKE GIVING SOMETHING AS A INPUT WHILE THE INPUTSTREAM IS LIKE GIVING SOMETHING AS AN OUTPUT 
                                // . THE NAMING THING MIGHT CONFUSE USER BUT THE PROCESS THEY DO ARE AS IT IS STATED ABOVE.

                                ostream = socket.getOutputStream();
                                
                             //IOException is used because , Streams are used That can be the reason of the InputOutputExceptions
                             //Because the daa is being written and read over the Network
                            } catch (IOException ex) {
                                
                                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                                System.out.println("There is an error here in line 1024 , Check this loop ");
                            
                            }
                            //DECLARING A PRINTWRITER HERE 
                            //PRINTWRITER IS BASICCALY LET US WRITE THE DATA THAT CAN BE LATER ON SET OVER A NETWORK
                            //PrintWriter is used to send characters to a text file
                               PrintWriter pwrite = new PrintWriter(ostream, true);
                               
                             //DECLARING THE BUFFERED READER HERE THAT TAKE THE (new InputStreamReader(System.in) AS A PARAMTER.
                             //NOW WHATS THE PURPOSE OF BUFFERED READER , WELL IT'S FOR GOD EFFICENCY AND TO REMOVE THE TIME DELAY OVER NETWROK!
                             //JAVA BUFFEREDREADER CLASS IS USED TO READ THE TEXT FROM A CHARACTER-BASED INPUT STREAM.
                             //IT CAN BE USED TO READ DATA LINE BY LINE BY READLINE() METHOD.

                               BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
                             
                               //THE PRINTWRITER HERE IS USED TO PRINT THE MESSAGE THAT SERVER HAS TYPED ON THE SCREEN OF SERVER HERE
                               pwrite.println(ServerMessage);             
                               //PWRITE FLUSH :
                               //AS , BY ITS NAME WHAT DOES IT MEANS IS FLUSHING WHAT WE HAVE WRITTEN , AN OVERVIEW IS THAT TO SENT OR FLUSH EVERY SINGLE BYTE TO RECEIVING END.
                               //THE FLUSH() METHOD OF PRINTWRITER CLASS IN JAVA IS USED TO FLUSH THE STREAM
                               pwrite.flush();

                               if ( ServerMessage.equalsIgnoreCase("Over"))
                               {
                                           
               
                    JOptionPane.showMessageDialog(null, "Server has left the Network! \n Your message won't send at the other end by now ! \n Leave by  Writting Over!");

                                 
                             //THE LOADSTAGE METHOD WILL BE CALLED AND THE LogInMenu.fxml File is run  
       
                    loadStage("feedBack.fxml");
                    Stage stage = ( Stage ) btnproceed.getScene().getWindow();
       
                               }
                               
                               //servermsg is Basically a list view as it is intialized in the Start 
                               //The message that the user typed is adding to the list View using the command getitems() as it is shown in line 1060 
                               servermsg.getItems().add(ServerMessage);
                               
                               //and after the message is stored and displayed it will set that textfield to blank
                               
                               txtServerMessage.setText("");
                }
              //SETONACTION FOR THE BUTTON IS CLOSED HERE
              });
          
    }
     
     //OOPCONCEPT IS USED HERE AGAIN
     //POLYMORPHISM-OVERRIDDING
     
    public void sentmsg() 
    
            //THIS METHODS IS THE BASIC OF OUR PROJECT 
            //IN THIS METHOD THE SERVER SOCKET IS AND
            //A REQUEST TO CREATE A NETWROK WITH CLIENT IS MADE
    {
        
     
        
     //EVENT HANDLING IS USED HERE , LAMBDA EXPRESSION IS USED TO CARRY OUT THE FUNCTION
     //HERE IT CALLS THE LOADSTAGE METHOD THAT IS OVER=RIDDEN TOO BECAUSE IT IS AN ABSTRACT METHOD IN AN INTERFACE . ITS AN ANOTHER OOP CONCEPT HERE 
     
     //REMEMBER THIS BUTTON IS GOING TO PRESS EVERY SINGLE TIME YOU SENT AND RECIEVE A MESSAGE FROM CLIENT , OTHERWISE THE SERVER MESSAGES IS ONLY DELIVERED AND CLIENT WILL NOT
     //THAT WILL RESULT IN TIME DELAY
     
        btnsent.setOnAction(e->{
   
            //THREADS ARE USED HERE
            //THREADS ARE BASICALLY USED TO CARRY MORE THAN 1 OPERATION AT A TIME
            //SIMALTANEOUSLY WITHOUT ANY HALTING
            
            Thread thread = new Thread("New Thread") {
      //THE THREAD OVERRIDES AN RUN-START METHOD
     //OOPCONCEPT IS USED HERE AGAIN
     //POLYMORPHISM-OVERRIDDING
     
                @Override
     //RUN METHOD OF THREADS IS OVER-RIDDEN HERE
           public void run(){
               
               //THREADS MAY BE THE REASON THAT AN EXCEPTION WILL BE THROWN
               //ERROR HANDLIMG IS USED HERE
               //USING TRY CATCH BLOCK
               
            try {
     
                //THIS STATEMENT IS USED TO START THE SERVER
                //SERVERSOCKET REQUIRES ONLY ONE DATAFIELD AS A PARAMETER
                //THAT IS A PORT NUMBER , A PORT NUMBER CAN ANY BE ANY INTEGER VALUE , BUT REMEMBER
                //THIS SHOULD BE SAME ON BOTH SERVER AND CLIENT SCENE
                
                    server = new ServerSocket(5000); 

                //THIS STATEMENT WILL BE EXECUTED AND SHOWN ON CONSOLE , THAT THE SERVER HAS STARTED
                //IF YOU RUN THE CLIENT FIRST AN ERROR WILL BE DISPLAYED SHOWING CONNECTION REFUSED
                
                    System.out.println("Server has Started "); 

                //THIS STATEMENT IS USED TO SENT THE REQUEST TO CLIENT TO JOIN THE NETWORK
                //socket is for client (*connection*)
                //server is for server (*connection*)
                
                    socket = server.accept(); 

                //THIS STATEMENT WILL BE EXECUTED AND SHOWN ON CONSOLE , THAT THE CLIENT HAS ACCEPTED 
                
                System.out.println("Client has accepted"); 

                //THIS DATAINPUT AND OUTPUT STREAM IN THIS JAVA FILE IS USED FOR THE 
                //MESSAGE DELIEVERING OF CLIENT SIDE
                
                //FETCH THE DATA FROM THE SOCKET ( CLIENT SIDE )
                
                in = new DataInputStream( new BufferedInputStream(socket.getInputStream()));      
                
                // SENDS THE DATA (OUTPUT ) TO THE SOCKET ( CLIENT )
                
                out    = new DataOutputStream(socket.getOutputStream()); 

                 }
            
          catch( IOException a)
          {

              System.out.println(" There is an error in line 1127 or On .. \n The treams can also be the reason of throwiing an Exception ");
          } 
            //THIS LOOP WILL CONTINUE AS SOON AS THE CONDITIOM IS TRUE
        while(true){     

          //LINE IS A STRING VARIABLE USED FOR THE CLIENT
          //SENDMESSAGE IS A VARIABLE USED FOR THR SERVER MESSAGE
         
          String line = "";
          String sendMessage = "";          


//          while (!line.equalsIgnoreCase("over")&&(!sendMessage.equalsIgnoreCase("over"))) 
    //        { 
             try
                    
                { 
                       //HERE , THE LINE STORES THE INPUT RECIEVED FROM THE CLIENT'S SIDE
                       //INPUTSTREAM IS BASICALLY USED TO READ FROM A FILE OR A NETWROK
                       // readUTF() : WHAT IT BASICALLY DOES IS THAT IT READS DATA AND THEN RETURN IT AS STRING.
                    
                        line = in.readUTF(); 
                        
                        //AFTER THE ABOVE STATEMENT IS EXECUTED AND LINE STORES IT , THIS WILL SHOW THE MESSAGE THAT IT HAS STORED
                        System.out.print("Client says :  ");
                        System.out.println(line); 
                        
                        if( line.equalsIgnoreCase("Over"))
                        {
                            
                        JOptionPane.showMessageDialog(null, "Client has left the Network! \n Your message won't send at the other end by now ! \n Leave by clicking button or Writting Over!");
                            

                        }
                        
                        //as clientmsg is a listview THAT IS BEING USED TO SHOW THE MESSAGE FROM THE CLIENT SIDE
                        //ALL THAT MESSAGES NEEDED TO BE DISPLAYED IN A LISTVIEW
                        //THATS WHY WE ARE USING GETITEMS AND THAT WILL ADD LINE ( STORES THAT MESSAGE FROM THE SOCKE(CLIENT))
                        
                       clientmsg.getItems().add(line);
                       
                       System.out.print("You says :  ");
                       
                       
                    //TWO EXCEPTIONS ARE COLLECTIVELY USED HERE
                    //BECAUSE THERE CAN BE THE REASIN THAT THESE BOTH EXCEPTIONS CAN BE OCCURED
                }catch(IOException | IllegalStateException x) 
                { 
                    
                    System.out.println(x); 
                
                }
             
             //ANOTHER IF-ELSE IS BEING USED HERE
             //THIS WILL EXECUTD WHEN ANYO OF ONE WRITE OVER , IRRESPECTIVE OF THE CASE ( UPPER OR LOWER)
             
            if(( sendMessage.equalsIgnoreCase("over"))&&(line.equalsIgnoreCase("over")))    
            {
                
                //ERROR HANDLING
                //TRY-CATCH BLOCK
                try { 

                    //SOCLETS AND STREAMS SHOULD BE CLOSED AFTER THEY ARE USED
                    //IT IS A GOOD PROGRAMMING PRACTICE
                    
                    socket.close();

                    in.close(); 
                } 
                
                catch (IOException ex) {
 
                     System.out.println("There can be error!");
                     
                     //WHAT THIS STATEMENT IS GOING TO DO , IT WILL SHOW THE STACK TRACE WHERE THE EXCEPTION IS OCCURED
                     ex.printStackTrace();
                                             }
            }
            else{
            }

            }   
            }
            };

          //THREAD IS STARTED!!!
            thread.start();
            
            
           
        });
    

        //If we want to create a multi user system , a chatting system we can use this belwo code and comment the ServerMessageClick and remaing part of sentmsg code.
        
//        try {
//
//          
//            System.out.println("Server has Started "); 
//
//            server = new ServerSocket(5000); 
//                        
//            socket = server.accept(); 
//
//          //  starter();
//
//            System.out.println("Client has accepted"); 
//        
//            theHanlderOne clientobject = new theHanlderOne(socket , clients );
//            
//            clients.add(clientobject);
//            
//            pool.execute(clientobject);
//            
//            
// 
//        }
//        catch (Exception m)
//        {
//            
//        }

    }
    
    
    //THIS METHOD WILL BE CALLED WHEN THE SERVER TYPED OVER OR THE CONNECTION IS DISCONNECTED AD THE THIS SCREEN WILL POP UP EHERE 
    //THE USER IS GIVEN THE CHOICE EITHER TO LEAVE STRAIGH AND GIVE THE FEEDBACK
    
    public void lastFeed()
    {
        lastfeedback.setOnAction(e->{
        
                   
                    //THE LOADSTAGE METHOD WILL BE CALLED AND THE LogInMenu.fxml File is run 
       
                    loadStage("feedBack.fxml");
                    Stage stage = ( Stage ) btnproceed.getScene().getWindow();
       
                       
        });
        
        
    }
    
    
    public void lastleaving()
    {
        
        btnlast.setOnAction(e->{
        
        
                 System.out.println("*************************************************************");
        
                 System.out.println("           THANKS FOR USING OUR APPLICATIONS");
                      
                 System.out.println("           LEAVING SUCCESSFULLY !!                ");
                      
                 System.out.println("**************************************************************");
                                    
        });
        
    }
    //ANOTHER OOP CONCEPT IS USED HERE
    //POLYMORPHISM - OVERRIDDING 
    
    @Override
    
    //THIS IS THE MOST IMPORTANT FUNCTION CREATED FOR THIS PROJECT!
    //THIS IS USED FOR CHANGING THE STAGE
    //THIS FUNCTION IS BEING CALLED SO MANY TIMES
    
    public void loadStage(String fxml) {


         Parent root = null;
         try {
    
             //LOAD THE ROOT 
              root = FXMLLoader.load(getClass().getResource(fxml));
         }
          catch(IOException e)
         {
         }
         
         //DECLARING THE STAGE
     Stage stage = new Stage();
     //assert root != null;
     //DECLARING A NEW SCENE
     //SETTING THE STAGE
     stage.setScene(new Scene ( root ));
     //SETTING THE STAGE SIZE
     stage.resizableProperty().setValue(false);
     //SJOWING THE STAGE
     stage.show();



    }
    
    //********************
    //   welcome Screen
    //********************

    // A class ShowSplashScreen Is Declared here
    //THIS IS THE WELCOME SCREEN THAT WILL BE SHOWN WHEN IT RUNS
    //IT IS BASICALLY A SPLASHSCREEN THAT EXTENDS THREAD
            
    class ShowSplashScreen extends Thread{

        
    //ANOTHER OOP CONCEPT IS USED HERE
    //POLYMORPHISM - OVERRIDDING 
        
        @Override
        //RUN METHOD IS BEING OVERRIDDEN , FROM THREADS
        public void run(){
             Stage stage;
            try {
                Thread.sleep(5000);
           
                    stage = new Stage();
                    Parent root = null;
                   
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    
                    
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    stage.close();
                    ap.getScene().getWindow().hide();
                     
                    
            } catch (InterruptedException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
    //ANOTHER OOP CONCEPT IS USED HERE
    //POLYMORPHISM - OVERRIDDING
    //INITILAZABLE 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

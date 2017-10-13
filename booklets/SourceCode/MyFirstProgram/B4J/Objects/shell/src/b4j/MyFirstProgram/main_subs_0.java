package b4j.MyFirstProgram;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,20);
if (RapidSub.canDelegate("appstart")) return main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 20;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(1048576);
main._mainform = _form1;
 BA.debugLineNum = 22;BA.debugLine="MainForm.RootPane.LoadLayout(\"Main\") 'Load the la";
Debug.ShouldStop(2097152);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Main")));
 BA.debugLineNum = 23;BA.debugLine="MainForm.Show";
Debug.ShouldStop(4194304);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 25;BA.debugLine="New";
Debug.ShouldStop(16777216);
_new();
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaction_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btnAction_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,28);
if (RapidSub.canDelegate("btnaction_mouseclicked")) return main.remoteMe.runUserSub(false, "main","btnaction_mouseclicked", _eventdata);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 28;BA.debugLine="Sub btnAction_MouseClicked (EventData As MouseEven";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="If btnAction.Text = \"O K\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main._btnaction.runMethod(true,"getText"),BA.ObjectToString("O K"))) { 
 BA.debugLineNum = 30;BA.debugLine="If txfResult.Text=\"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main._txfresult.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 31;BA.debugLine="lblComments.Text = \"No result entered\" & CRLF &";
Debug.ShouldStop(1073741824);
main._lblcomments.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("No result entered"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Enter a result"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("and click on OK")));
 }else {
 BA.debugLineNum = 33;BA.debugLine="CheckResult";
Debug.ShouldStop(1);
_checkresult();
 };
 }else {
 BA.debugLineNum = 36;BA.debugLine="New";
Debug.ShouldStop(8);
_new();
 BA.debugLineNum = 37;BA.debugLine="btnAction.Text = \"O K\"";
Debug.ShouldStop(16);
main._btnaction.runMethod(true,"setText",BA.ObjectToString("O K"));
 };
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkresult() throws Exception{
try {
		Debug.PushSubsStack("CheckResult (main) ","main",0,main.ba,main.mostCurrent,50);
if (RapidSub.canDelegate("checkresult")) return main.remoteMe.runUserSub(false, "main","checkresult");
 BA.debugLineNum = 50;BA.debugLine="Private Sub CheckResult";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="If txfResult.Text = Number1 + Number2 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main._txfresult.runMethod(true,"getText"),BA.NumberToString(RemoteObject.solve(new RemoteObject[] {main._number1,main._number2}, "+",1, 1)))) { 
 BA.debugLineNum = 52;BA.debugLine="lblComments.Text = \"G O O D  result\" & CRLF & \"C";
Debug.ShouldStop(524288);
main._lblcomments.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("G O O D  result"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Click on NEW")));
 BA.debugLineNum = 53;BA.debugLine="btnAction.Text = \"N E W\"";
Debug.ShouldStop(1048576);
main._btnaction.runMethod(true,"setText",BA.ObjectToString("N E W"));
 }else {
 BA.debugLineNum = 55;BA.debugLine="lblComments.Text = \"W R O N G  result\" & CRLF &";
Debug.ShouldStop(4194304);
main._lblcomments.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("W R O N G  result"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Enter a new result"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("and click OK")));
 };
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _new() throws Exception{
try {
		Debug.PushSubsStack("New (main) ","main",0,main.ba,main.mostCurrent,41);
if (RapidSub.canDelegate("new")) return main.remoteMe.runUserSub(false, "main","new");
 BA.debugLineNum = 41;BA.debugLine="Private Sub New";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Number1 = Rnd(1, 10)			' Generates a random numbe";
Debug.ShouldStop(512);
main._number1 = main.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 43;BA.debugLine="Number2 = Rnd(1, 10)			' Generates a random numbe";
Debug.ShouldStop(1024);
main._number2 = main.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 44;BA.debugLine="lblNumber1.Text = Number1		' Displays Number1 in";
Debug.ShouldStop(2048);
main._lblnumber1.runMethod(true,"setText",BA.NumberToString(main._number1));
 BA.debugLineNum = 45;BA.debugLine="lblNumber2.Text = Number2		' Displays Number2 in";
Debug.ShouldStop(4096);
main._lblnumber2.runMethod(true,"setText",BA.NumberToString(main._number2));
 BA.debugLineNum = 46;BA.debugLine="lblComments.Text = \"Enter the result\" & CRLF & \"a";
Debug.ShouldStop(8192);
main._lblcomments.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Enter the result"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("and click on OK")));
 BA.debugLineNum = 47;BA.debugLine="txfResult.Text = \"\"			' Sets edtResult.Text to em";
Debug.ShouldStop(16384);
main._txfresult.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.MyFirstProgram.main");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 10;BA.debugLine="Private btnAction As Button";
main._btnaction = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private lblComments As Label";
main._lblcomments = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private lblMathSign As Label";
main._lblmathsign = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private lblNumber1 As Label";
main._lblnumber1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private lblNumber2 As Label";
main._lblnumber2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private txfResult As TextField";
main._txfresult = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Number1, Number2 As Int";
main._number1 = RemoteObject.createImmutable(0);
main._number2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}
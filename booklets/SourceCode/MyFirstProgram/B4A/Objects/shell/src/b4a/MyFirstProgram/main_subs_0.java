package b4a.MyFirstProgram;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return b4a.MyFirstProgram.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"Main\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="New";
Debug.ShouldStop(-2147483648);
_new();
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) return b4a.MyFirstProgram.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) return b4a.MyFirstProgram.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaction_click() throws Exception{
try {
		Debug.PushSubsStack("btnAction_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("btnaction_click")) return b4a.MyFirstProgram.main.remoteMe.runUserSub(false, "main","btnaction_click");
 BA.debugLineNum = 52;BA.debugLine="Sub btnAction_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If btnAction.Text = \"O K\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main.mostCurrent._btnaction.runMethod(true,"getText"),BA.ObjectToString("O K"))) { 
 BA.debugLineNum = 54;BA.debugLine="If edtResult.Text = \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edtresult.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 55;BA.debugLine="Msgbox(\"No result entered\",\"E R R O R\")";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No result entered")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("E R R O R"))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 57;BA.debugLine="CheckResult";
Debug.ShouldStop(16777216);
_checkresult();
 };
 }else {
 BA.debugLineNum = 60;BA.debugLine="New";
Debug.ShouldStop(134217728);
_new();
 BA.debugLineNum = 61;BA.debugLine="btnAction.Text = \"O K\"";
Debug.ShouldStop(268435456);
main.mostCurrent._btnaction.runMethod(true,"setText",BA.ObjectToCharSequence("O K"));
 };
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkresult() throws Exception{
try {
		Debug.PushSubsStack("CheckResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
if (RapidSub.canDelegate("checkresult")) return b4a.MyFirstProgram.main.remoteMe.runUserSub(false, "main","checkresult");
 BA.debugLineNum = 65;BA.debugLine="Sub CheckResult";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="If edtResult.Text = Number1 + Number2 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edtresult.runMethod(true,"getText"),BA.NumberToString(RemoteObject.solve(new RemoteObject[] {main._number1,main._number2}, "+",1, 1)))) { 
 BA.debugLineNum = 67;BA.debugLine="lblComments.Text = \"G O O D  result\" & CRLF & \"C";
Debug.ShouldStop(4);
main.mostCurrent._lblcomments.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("G O O D  result"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Click on NEW"))));
 BA.debugLineNum = 68;BA.debugLine="btnAction.Text = \"N E W\"";
Debug.ShouldStop(8);
main.mostCurrent._btnaction.runMethod(true,"setText",BA.ObjectToCharSequence("N E W"));
 }else {
 BA.debugLineNum = 70;BA.debugLine="lblComments.Text = \"W R O N G  result\" & CRLF &";
Debug.ShouldStop(32);
main.mostCurrent._lblcomments.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("W R O N G  result"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Enter a new result"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("and click OK"))));
 };
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private btnAction As Button";
main.mostCurrent._btnaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private edtResult As EditText";
main.mostCurrent._edtresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblComments As Label";
main.mostCurrent._lblcomments = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblMathSign As Label";
main.mostCurrent._lblmathsign = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblNumber1 As Label";
main.mostCurrent._lblnumber1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblNumber2 As Label";
main.mostCurrent._lblnumber2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Number1, Number2 As Int";
main._number1 = RemoteObject.createImmutable(0);
main._number2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _new() throws Exception{
try {
		Debug.PushSubsStack("New (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("new")) return b4a.MyFirstProgram.main.remoteMe.runUserSub(false, "main","new");
 BA.debugLineNum = 43;BA.debugLine="Sub New";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Number1 = Rnd(1, 10)			' Generates a random numbe";
Debug.ShouldStop(2048);
main._number1 = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 45;BA.debugLine="Number2 = Rnd(1, 10)			' Generates a random numbe";
Debug.ShouldStop(4096);
main._number2 = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 46;BA.debugLine="lblNumber1.Text = Number1		' Displays Number1 in";
Debug.ShouldStop(8192);
main.mostCurrent._lblnumber1.runMethod(true,"setText",BA.ObjectToCharSequence(main._number1));
 BA.debugLineNum = 47;BA.debugLine="lblNumber2.Text = Number2		' Displays Number2 in";
Debug.ShouldStop(16384);
main.mostCurrent._lblnumber2.runMethod(true,"setText",BA.ObjectToCharSequence(main._number2));
 BA.debugLineNum = 48;BA.debugLine="lblComments.Text = \"Enter the result\" & CRLF & \"a";
Debug.ShouldStop(32768);
main.mostCurrent._lblcomments.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Enter the result"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("and click on OK"))));
 BA.debugLineNum = 49;BA.debugLine="edtResult.Text = \"\"			' Sets edtResult.Text to em";
Debug.ShouldStop(65536);
main.mostCurrent._edtresult.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.MyFirstProgram.main");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}
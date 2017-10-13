package b4a.SecondProgram;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) return b4a.SecondProgram.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"Main\")";
Debug.ShouldStop(536870912);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="New";
Debug.ShouldStop(1073741824);
_new();
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) return b4a.SecondProgram.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) return b4a.SecondProgram.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btnAction_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("btnaction_click")) return b4a.SecondProgram.main.remoteMe.runUserSub(false, "main","btnaction_click");
 BA.debugLineNum = 53;BA.debugLine="Sub btnAction_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="If btnAction.Text = \"O K\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",main.mostCurrent._btnaction.runMethod(true,"getText"),BA.ObjectToString("O K"))) { 
 BA.debugLineNum = 55;BA.debugLine="If lblResult.Text=\"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent._lblresult.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 56;BA.debugLine="Msgbox(\"No result entered\",\"E R R O R\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No result entered")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("E R R O R"))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 58;BA.debugLine="CheckResult";
Debug.ShouldStop(33554432);
_checkresult();
 };
 }else {
 BA.debugLineNum = 61;BA.debugLine="New";
Debug.ShouldStop(268435456);
_new();
 BA.debugLineNum = 62;BA.debugLine="btnAction.Text = \"O K\"";
Debug.ShouldStop(536870912);
main.mostCurrent._btnaction.runMethod(true,"setText",BA.ObjectToCharSequence("O K"));
 BA.debugLineNum = 63;BA.debugLine="lblResult.Text = \"\" & Chr(0xE632)";
Debug.ShouldStop(1073741824);
main.mostCurrent._lblresult.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe632))))));
 };
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnevent_click() throws Exception{
try {
		Debug.PushSubsStack("btnEvent_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,78);
if (RapidSub.canDelegate("btnevent_click")) return b4a.SecondProgram.main.remoteMe.runUserSub(false, "main","btnevent_click");
RemoteObject _btnsender = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 78;BA.debugLine="Sub btnEvent_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Private btnSender As Button";
Debug.ShouldStop(16384);
_btnsender = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btnSender", _btnsender);
 BA.debugLineNum = 81;BA.debugLine="btnSender = Sender";
Debug.ShouldStop(65536);
_btnsender.setObject(main.mostCurrent.__c.runMethod(false,"Sender",main.mostCurrent.activityBA));
 BA.debugLineNum = 83;BA.debugLine="Select btnSender.Tag";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(_btnsender.runMethod(false,"getTag"),RemoteObject.createImmutable(("BS")))) {
case 0: {
 BA.debugLineNum = 85;BA.debugLine="If lblResult.Text.Length >0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",main.mostCurrent._lblresult.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 86;BA.debugLine="lblResult.Text = lblResult.Text.SubString2(0,lb";
Debug.ShouldStop(2097152);
main.mostCurrent._lblresult.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._lblresult.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent._lblresult.runMethod(true,"getText").runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 };
 break; }
default: {
 BA.debugLineNum = 89;BA.debugLine="lblResult.Text = lblResult.Text & btnSender.Text";
Debug.ShouldStop(16777216);
main.mostCurrent._lblresult.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._lblresult.runMethod(true,"getText"),_btnsender.runMethod(true,"getText"))));
 break; }
}
;
 BA.debugLineNum = 92;BA.debugLine="If lblResult.Text.Length = 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main.mostCurrent._lblresult.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 93;BA.debugLine="btn0.Visible = False";
Debug.ShouldStop(268435456);
main.mostCurrent._btn0.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 95;BA.debugLine="btn0.Visible = True";
Debug.ShouldStop(1073741824);
main.mostCurrent._btn0.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("CheckResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
if (RapidSub.canDelegate("checkresult")) return b4a.SecondProgram.main.remoteMe.runUserSub(false, "main","checkresult");
 BA.debugLineNum = 67;BA.debugLine="Sub CheckResult";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="If lblResult.Text = Number1 + Number2 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main.mostCurrent._lblresult.runMethod(true,"getText"),BA.NumberToString(RemoteObject.solve(new RemoteObject[] {main._number1,main._number2}, "+",1, 1)))) { 
 BA.debugLineNum = 69;BA.debugLine="lblComments.Text = \"G O O D  result\" & CRLF & \"C";
Debug.ShouldStop(16);
main.mostCurrent._lblcomments.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("G O O D  result"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Click on NEW"))));
 BA.debugLineNum = 70;BA.debugLine="lblComments.Color = Colors.RGB(128,255,128)	' li";
Debug.ShouldStop(32);
main.mostCurrent._lblcomments.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 128))));
 BA.debugLineNum = 71;BA.debugLine="btnAction.Text = \"N E W\"";
Debug.ShouldStop(64);
main.mostCurrent._btnaction.runMethod(true,"setText",BA.ObjectToCharSequence("N E W"));
 }else {
 BA.debugLineNum = 73;BA.debugLine="lblComments.Text = \"W R O N G  result\" & CRLF &";
Debug.ShouldStop(256);
main.mostCurrent._lblcomments.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("W R O N G  result"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Enter a new result"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("and click OK"))));
 BA.debugLineNum = 74;BA.debugLine="lblComments.Color = Colors.RGB(255,128,128)	' li";
Debug.ShouldStop(512);
main.mostCurrent._lblcomments.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 128))));
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 20;BA.debugLine="Private btnAction, btn0 As Button";
main.mostCurrent._btnaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
main.mostCurrent._btn0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblResult As Label";
main.mostCurrent._lblresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblComments As Label";
main.mostCurrent._lblcomments = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblMathSign As Label";
main.mostCurrent._lblmathsign = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblNumber1 As Label";
main.mostCurrent._lblnumber1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblNumber2 As Label";
main.mostCurrent._lblnumber2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Number1, Number2 As Int";
main._number1 = RemoteObject.createImmutable(0);
main._number2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _new() throws Exception{
try {
		Debug.PushSubsStack("New (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,42);
if (RapidSub.canDelegate("new")) return b4a.SecondProgram.main.remoteMe.runUserSub(false, "main","new");
 BA.debugLineNum = 42;BA.debugLine="Sub New";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Number1 = Rnd(1, 10)			' Generates a random numbe";
Debug.ShouldStop(1024);
main._number1 = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 44;BA.debugLine="Number2 = Rnd(1, 10)			' Generates a random numbe";
Debug.ShouldStop(2048);
main._number2 = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 45;BA.debugLine="lblNumber1.Text = Number1	' Displays Number1 in l";
Debug.ShouldStop(4096);
main.mostCurrent._lblnumber1.runMethod(true,"setText",BA.ObjectToCharSequence(main._number1));
 BA.debugLineNum = 46;BA.debugLine="lblNumber2.Text = Number2	' Displays Number2 in l";
Debug.ShouldStop(8192);
main.mostCurrent._lblnumber2.runMethod(true,"setText",BA.ObjectToCharSequence(main._number2));
 BA.debugLineNum = 47;BA.debugLine="lblComments.Text = \"Enter the result\" & CRLF & \"a";
Debug.ShouldStop(16384);
main.mostCurrent._lblcomments.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Enter the result"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("and click on OK"))));
 BA.debugLineNum = 48;BA.debugLine="lblComments.Color = Colors.RGB(255,235,128)	' yel";
Debug.ShouldStop(32768);
main.mostCurrent._lblcomments.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 235)),(Object)(BA.numberCast(int.class, 128))));
 BA.debugLineNum = 49;BA.debugLine="lblResult.Text = \"\"				' Sets lblResult.Text to e";
Debug.ShouldStop(65536);
main.mostCurrent._lblresult.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 50;BA.debugLine="btn0.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._btn0.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
main.myClass = BA.getDeviceClass ("b4a.SecondProgram.main");
		
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
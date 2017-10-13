package b4j.MyFirstProgram;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.MyFirstProgram", "b4j.MyFirstProgram.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.MyFirstProgram", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.MyFirstProgram.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 400, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnaction = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblcomments = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblmathsign = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblnumber1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblnumber2 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txfresult = null;
public static int _number1 = 0;
public static int _number2 = 0;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart"))
	return (String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args});
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"Main\") 'Load the la";
_mainform.getRootPane().LoadLayout(ba,"Main");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="New";
_new();
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="End Sub";
return "";
}
public static String  _new() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "new"))
	return (String) Debug.delegate(ba, "new", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub New";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Number1 = Rnd(1, 10)			' Generates a random numbe";
_number1 = anywheresoftware.b4a.keywords.Common.Rnd((int) (1),(int) (10));
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Number2 = Rnd(1, 10)			' Generates a random numbe";
_number2 = anywheresoftware.b4a.keywords.Common.Rnd((int) (1),(int) (10));
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="lblNumber1.Text = Number1		' Displays Number1 in";
_lblnumber1.setText(BA.NumberToString(_number1));
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="lblNumber2.Text = Number2		' Displays Number2 in";
_lblnumber2.setText(BA.NumberToString(_number2));
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="lblComments.Text = \"Enter the result\" & CRLF & \"a";
_lblcomments.setText("Enter the result"+anywheresoftware.b4a.keywords.Common.CRLF+"and click on OK");
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="txfResult.Text = \"\"			' Sets edtResult.Text to em";
_txfresult.setText("");
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="End Sub";
return "";
}
public static String  _btnaction_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnaction_mouseclicked"))
	return (String) Debug.delegate(ba, "btnaction_mouseclicked", new Object[] {_eventdata});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub btnAction_MouseClicked (EventData As MouseEven";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If btnAction.Text = \"O K\" Then";
if ((_btnaction.getText()).equals("O K")) { 
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="If txfResult.Text=\"\" Then";
if ((_txfresult.getText()).equals("")) { 
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="lblComments.Text = \"No result entered\" & CRLF &";
_lblcomments.setText("No result entered"+anywheresoftware.b4a.keywords.Common.CRLF+"Enter a result"+anywheresoftware.b4a.keywords.Common.CRLF+"and click on OK");
 }else {
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="CheckResult";
_checkresult();
 };
 }else {
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="New";
_new();
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="btnAction.Text = \"O K\"";
_btnaction.setText("O K");
 };
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="End Sub";
return "";
}
public static String  _checkresult() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checkresult"))
	return (String) Debug.delegate(ba, "checkresult", null);
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub CheckResult";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="If txfResult.Text = Number1 + Number2 Then";
if ((_txfresult.getText()).equals(BA.NumberToString(_number1+_number2))) { 
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="lblComments.Text = \"G O O D  result\" & CRLF & \"C";
_lblcomments.setText("G O O D  result"+anywheresoftware.b4a.keywords.Common.CRLF+"Click on NEW");
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="btnAction.Text = \"N E W\"";
_btnaction.setText("N E W");
 }else {
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="lblComments.Text = \"W R O N G  result\" & CRLF &";
_lblcomments.setText("W R O N G  result"+anywheresoftware.b4a.keywords.Common.CRLF+"Enter a new result"+anywheresoftware.b4a.keywords.Common.CRLF+"and click OK");
 };
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="End Sub";
return "";
}
}
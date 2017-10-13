package b4a.SecondProgram;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.SecondProgram", "b4a.SecondProgram.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, true))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.SecondProgram", "b4a.SecondProgram.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.SecondProgram.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaction = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn0 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblresult = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcomments = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmathsign = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnumber1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnumber2 = null;
public static int _number1 = 0;
public static int _number2 = 0;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Activity.LoadLayout(\"Main\")";
mostCurrent._activity.LoadLayout("Main",mostCurrent.activityBA);
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="New";
_new();
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="End Sub";
return "";
}
public static String  _new() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "new"))
	return (String) Debug.delegate(mostCurrent.activityBA, "new", null);
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub New";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Number1 = Rnd(1, 10)			' Generates a random numbe";
_number1 = anywheresoftware.b4a.keywords.Common.Rnd((int) (1),(int) (10));
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Number2 = Rnd(1, 10)			' Generates a random numbe";
_number2 = anywheresoftware.b4a.keywords.Common.Rnd((int) (1),(int) (10));
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="lblNumber1.Text = Number1	' Displays Number1 in l";
mostCurrent._lblnumber1.setText(BA.ObjectToCharSequence(_number1));
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="lblNumber2.Text = Number2	' Displays Number2 in l";
mostCurrent._lblnumber2.setText(BA.ObjectToCharSequence(_number2));
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="lblComments.Text = \"Enter the result\" & CRLF & \"a";
mostCurrent._lblcomments.setText(BA.ObjectToCharSequence("Enter the result"+anywheresoftware.b4a.keywords.Common.CRLF+"and click on OK"));
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="lblComments.Color = Colors.RGB(255,235,128)	' yel";
mostCurrent._lblcomments.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (235),(int) (128)));
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="lblResult.Text = \"\"				' Sets lblResult.Text to e";
mostCurrent._lblresult.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="btn0.Visible = False";
mostCurrent._btn0.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _btnaction_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaction_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnaction_click", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub btnAction_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If btnAction.Text = \"O K\" Then";
if ((mostCurrent._btnaction.getText()).equals("O K")) { 
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="If lblResult.Text=\"\" Then";
if ((mostCurrent._lblresult.getText()).equals("")) { 
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Msgbox(\"No result entered\",\"E R R O R\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No result entered"),BA.ObjectToCharSequence("E R R O R"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="CheckResult";
_checkresult();
 };
 }else {
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="New";
_new();
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="btnAction.Text = \"O K\"";
mostCurrent._btnaction.setText(BA.ObjectToCharSequence("O K"));
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="lblResult.Text = \"\" & Chr(0xE632)";
mostCurrent._lblresult.setText(BA.ObjectToCharSequence(""+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe632)))));
 };
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="End Sub";
return "";
}
public static String  _checkresult() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkresult"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkresult", null);
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub CheckResult";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="If lblResult.Text = Number1 + Number2 Then";
if ((mostCurrent._lblresult.getText()).equals(BA.NumberToString(_number1+_number2))) { 
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="lblComments.Text = \"G O O D  result\" & CRLF & \"C";
mostCurrent._lblcomments.setText(BA.ObjectToCharSequence("G O O D  result"+anywheresoftware.b4a.keywords.Common.CRLF+"Click on NEW"));
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="lblComments.Color = Colors.RGB(128,255,128)	' li";
mostCurrent._lblcomments.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (128),(int) (255),(int) (128)));
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="btnAction.Text = \"N E W\"";
mostCurrent._btnaction.setText(BA.ObjectToCharSequence("N E W"));
 }else {
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="lblComments.Text = \"W R O N G  result\" & CRLF &";
mostCurrent._lblcomments.setText(BA.ObjectToCharSequence("W R O N G  result"+anywheresoftware.b4a.keywords.Common.CRLF+"Enter a new result"+anywheresoftware.b4a.keywords.Common.CRLF+"and click OK"));
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="lblComments.Color = Colors.RGB(255,128,128)	' li";
mostCurrent._lblcomments.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (128),(int) (128)));
 };
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="End Sub";
return "";
}
public static String  _btnevent_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnevent_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnevent_click", null);
anywheresoftware.b4a.objects.ButtonWrapper _btnsender = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub btnEvent_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Private btnSender As Button";
_btnsender = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="btnSender = Sender";
_btnsender.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Select btnSender.Tag";
switch (BA.switchObjectToInt(_btnsender.getTag(),(Object)("BS"))) {
case 0: {
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="If lblResult.Text.Length >0 Then";
if (mostCurrent._lblresult.getText().length()>0) { 
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="lblResult.Text = lblResult.Text.SubString2(0,lb";
mostCurrent._lblresult.setText(BA.ObjectToCharSequence(mostCurrent._lblresult.getText().substring((int) (0),(int) (mostCurrent._lblresult.getText().length()-1))));
 };
 break; }
default: {
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="lblResult.Text = lblResult.Text & btnSender.Text";
mostCurrent._lblresult.setText(BA.ObjectToCharSequence(mostCurrent._lblresult.getText()+_btnsender.getText()));
 break; }
}
;
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="If lblResult.Text.Length = 0 Then";
if (mostCurrent._lblresult.getText().length()==0) { 
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="btn0.Visible = False";
mostCurrent._btn0.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="btn0.Visible = True";
mostCurrent._btn0.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="End Sub";
return "";
}
}
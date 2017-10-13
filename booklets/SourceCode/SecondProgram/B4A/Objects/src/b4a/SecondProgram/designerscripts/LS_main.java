package b4a.SecondProgram.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_main{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[main/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="lblMathSign.HorizontalCenter = 50%x	' centers the view on the middle of the screen"[main/General script]
views.get("lblmathsign").vw.setLeft((int)((50d / 100 * width) - (views.get("lblmathsign").vw.getWidth() / 2)));
//BA.debugLineNum = 5;BA.debugLine="lblNumber1.Right = lblMathSign.Left	' aligns the right edge ont the left edge"[main/General script]
views.get("lblnumber1").vw.setLeft((int)((views.get("lblmathsign").vw.getLeft()) - (views.get("lblnumber1").vw.getWidth())));
//BA.debugLineNum = 6;BA.debugLine="lblNumber2.Left = lblMathSign.Right	' aligns the left edge ont the right edge"[main/General script]
views.get("lblnumber2").vw.setLeft((int)((views.get("lblmathsign").vw.getLeft() + views.get("lblmathsign").vw.getWidth())));
//BA.debugLineNum = 7;BA.debugLine="lblResult.HorizontalCenter = 50%x	' centers the view on the middle of the screen"[main/General script]
views.get("lblresult").vw.setLeft((int)((50d / 100 * width) - (views.get("lblresult").vw.getWidth() / 2)));
//BA.debugLineNum = 8;BA.debugLine="lblComments.HorizontalCenter = 50%x	' centers the view on the middle of the screen"[main/General script]
views.get("lblcomments").vw.setLeft((int)((50d / 100 * width) - (views.get("lblcomments").vw.getWidth() / 2)));
//BA.debugLineNum = 9;BA.debugLine="pnlKeyboard.HorizontalCenter = 50%x	' centers the view on the middle of the screen"[main/General script]
views.get("pnlkeyboard").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlkeyboard").vw.getWidth() / 2)));

}
}
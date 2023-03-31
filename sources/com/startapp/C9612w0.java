package com.startapp;

import android.app.Activity;
import java.net.URLDecoder;
import java.util.Map;

/* renamed from: com.startapp.w0 */
/* compiled from: Sta */
public abstract class C9612w0 implements C9131m6 {
    private static final String LOG_TAG = "w0";
    public C9613a openListener;

    /* renamed from: com.startapp.w0$a */
    /* compiled from: Sta */
    public interface C9613a {
        boolean onClickEvent(String str);
    }

    public C9612w0(C9613a aVar) {
        this.openListener = aVar;
    }

    public void applyOrientationProperties(Activity activity, C9553t6 t6Var) {
        try {
            int i = 0;
            int i2 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            int i3 = t6Var.f39190b;
            if (i3 == 0) {
                i = 1;
            } else if (i3 != 1) {
                i = t6Var.f39189a ? -1 : i2;
            }
            int i4 = C8837b0.f36438a;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    public abstract void close();

    public void createCalendarEvent(String str) {
        isFeatureSupported("calendar");
    }

    public void expand(String str) {
    }

    public abstract boolean isFeatureSupported(String str);

    public boolean open(String str) {
        try {
            String trim = URLDecoder.decode(str, "UTF-8").trim();
            if (trim.startsWith("sms")) {
                return openSMS(trim);
            }
            if (trim.startsWith("tel")) {
                return openTel(trim);
            }
            return this.openListener.onClickEvent(trim);
        } catch (Exception unused) {
            return this.openListener.onClickEvent(str);
        }
    }

    public boolean openSMS(String str) {
        isFeatureSupported("sms");
        return true;
    }

    public boolean openTel(String str) {
        isFeatureSupported("tel");
        return true;
    }

    public void playVideo(String str) {
        isFeatureSupported("inlineVideo");
    }

    public void resize() {
    }

    public void setExpandProperties(Map<String, String> map) {
    }

    public abstract void setOrientationProperties(Map<String, String> map);

    public void setResizeProperties(Map<String, String> map) {
    }

    public void storePicture(String str) {
        isFeatureSupported("storePicture");
    }

    public abstract void useCustomClose(String str);
}

package p264io.flutter.plugins.webviewflutter;

import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.flutter.plugins.webviewflutter.c */
/* compiled from: DisplayListenerProxy */
class C10893c {

    /* renamed from: a */
    private ArrayList<DisplayManager.DisplayListener> f42450a;

    /* renamed from: io.flutter.plugins.webviewflutter.c$a */
    /* compiled from: DisplayListenerProxy */
    class C10894a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        final /* synthetic */ ArrayList f42451a;

        /* renamed from: b */
        final /* synthetic */ DisplayManager f42452b;

        C10894a(ArrayList arrayList, DisplayManager displayManager) {
            this.f42451a = arrayList;
            this.f42452b = displayManager;
        }

        public void onDisplayAdded(int i) {
            Iterator it = this.f42451a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i);
            }
        }

        public void onDisplayChanged(int i) {
            if (this.f42452b.getDisplay(i) != null) {
                Iterator it = this.f42451a.iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i);
                }
            }
        }

        public void onDisplayRemoved(int i) {
            Iterator it = this.f42451a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i);
            }
        }
    }

    C10893c() {
    }

    /* renamed from: c */
    private static ArrayList<DisplayManager.DisplayListener> m54297c(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList<>();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            Field field = null;
            ArrayList<DisplayManager.DisplayListener> arrayList = new ArrayList<>();
            Iterator it = ((ArrayList) declaredField2.get(obj)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList.add((DisplayManager.DisplayListener) field.get(next));
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchFieldException e) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList<>();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34639a(DisplayManager displayManager) {
        ArrayList<DisplayManager.DisplayListener> c = m54297c(displayManager);
        c.removeAll(this.f42450a);
        if (!c.isEmpty()) {
            Iterator<DisplayManager.DisplayListener> it = c.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener(it.next());
                displayManager.registerDisplayListener(new C10894a(c, displayManager), (Handler) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo34640b(DisplayManager displayManager) {
        this.f42450a = m54297c(displayManager);
    }
}

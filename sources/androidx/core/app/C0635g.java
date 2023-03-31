package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.p010os.C0759a;
import androidx.core.view.C0905f;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1220n;
import androidx.lifecycle.C1222o;
import androidx.lifecycle.C1236x;
import p124r.C5426g;

/* renamed from: androidx.core.app.g */
/* compiled from: ComponentActivity */
public class C0635g extends Activity implements C1220n, C0905f.C0906a {
    private C5426g<Class<? extends C0636a>, C0636a> mExtraDataMap = new C5426g<>();
    private C1222o mLifecycleRegistry = new C1222o(this);

    @Deprecated
    /* renamed from: androidx.core.app.g$a */
    /* compiled from: ComponentActivity */
    public static class C0636a {
    }

    private static boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31) {
                    return true;
                }
                return false;
            case 1:
            case 2:
                return C0759a.m3507d();
            case 3:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0905f.m4106d(decorView, keyEvent)) {
            return C0905f.m4107e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0905f.m4106d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends C0636a> T getExtraData(Class<T> cls) {
        return (C0636a) this.mExtraDataMap.get(cls);
    }

    public C1208j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1236x.m5481g(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo4409j(C1208j.C1211c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(C0636a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}

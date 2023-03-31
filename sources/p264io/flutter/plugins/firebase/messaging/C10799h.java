package p264io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import androidx.core.app.C0615b;
import java.util.ArrayList;
import p186ac.C6566p;

/* renamed from: io.flutter.plugins.firebase.messaging.h */
/* compiled from: FlutterFirebasePermissionManager */
class C10799h implements C6566p {

    /* renamed from: a */
    private final int f42212a = 240;

    /* renamed from: b */
    private C10800a f42213b;

    /* renamed from: c */
    private boolean f42214c = false;

    @FunctionalInterface
    /* renamed from: io.flutter.plugins.firebase.messaging.h$a */
    /* compiled from: FlutterFirebasePermissionManager */
    interface C10800a {
        /* renamed from: a */
        void mo34416a(int i);
    }

    C10799h() {
    }

    /* renamed from: a */
    public void mo34424a(Activity activity, C10800a aVar, C10788a aVar2) {
        if (this.f42214c) {
            aVar2.onError("A request for permissions is already running, please wait for it to finish before doing another request.");
        } else if (activity == null) {
            aVar2.onError("Unable to detect current Android Activity.");
        } else {
            this.f42213b = aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.POST_NOTIFICATIONS");
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (!this.f42214c) {
                C0615b.m2923u(activity, strArr, 240);
                this.f42214c = true;
            }
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C10800a aVar;
        int i2 = 0;
        if (!this.f42214c || i != 240 || (aVar = this.f42213b) == null) {
            return false;
        }
        this.f42214c = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            i2 = 1;
        }
        aVar.mo34416a(i2);
        return true;
    }
}

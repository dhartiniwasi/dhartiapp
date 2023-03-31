package p260ib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.C0615b;
import androidx.core.content.C0681a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p186ac.C6544d;
import p186ac.C6556k;
import p186ac.C6563m;
import p186ac.C6566p;
import p217de.mintware.barcode_scan.BarcodeScannerActivity;

/* renamed from: ib.a */
/* compiled from: ActivityHelper.kt */
public final class C10572a implements C6563m, C6566p {

    /* renamed from: e */
    public static final C10573a f41612e = new C10573a((C11665g) null);

    /* renamed from: a */
    private Context f41613a;

    /* renamed from: b */
    private Activity f41614b;

    /* renamed from: c */
    private final HashMap<Integer, C6563m> f41615c;

    /* renamed from: d */
    private final HashMap<Integer, C6566p> f41616d;

    /* renamed from: ib.a$a */
    /* compiled from: ActivityHelper.kt */
    public static final class C10573a {
        private C10573a() {
        }

        public /* synthetic */ C10573a(C11665g gVar) {
            this();
        }
    }

    public C10572a(Context context, Activity activity) {
        this.f41613a = context;
        this.f41614b = activity;
        this.f41615c = new LinkedHashMap();
        this.f41616d = new LinkedHashMap();
    }

    /* renamed from: a */
    public final boolean mo33770a(C6544d.C6546b bVar) {
        if (this.f41614b == null) {
            Log.d("BarcodeScanPlugin", "Could not launch BarcodeScannerActivity because the plugin is not attached to any activity");
            return false;
        }
        this.f41616d.put(200, new C10589i(bVar));
        String[] strArr = {"android.permission.CAMERA"};
        Activity activity = this.f41614b;
        C11669k.m56784b(activity);
        if (C0681a.m3145a(activity, "android.permission.CAMERA") == 0) {
            return false;
        }
        Activity activity2 = this.f41614b;
        C11669k.m56784b(activity2);
        C0615b.m2923u(activity2, strArr, 200);
        return true;
    }

    /* renamed from: b */
    public final void mo33771b(Activity activity) {
        this.f41614b = activity;
    }

    /* renamed from: c */
    public final void mo33772c(C6556k.C6561d dVar, C10581f fVar) {
        C11669k.m56787e(dVar, "result");
        C11669k.m56787e(fVar, "config");
        if (this.f41614b == null) {
            Log.d("BarcodeScanPlugin", "Could not launch BarcodeScannerActivity because the plugin is not attached to any activity");
            return;
        }
        this.f41615c.put(100, new C10590j(dVar));
        Intent intent = new Intent(this.f41613a, BarcodeScannerActivity.class);
        intent.putExtra("config", fVar.mo26773h());
        Activity activity = this.f41614b;
        C11669k.m56784b(activity);
        activity.startActivityForResult(intent, 100);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (!this.f41615c.containsKey(Integer.valueOf(i))) {
            return false;
        }
        return ((C6563m) C10508b0.m52914f(this.f41615c, Integer.valueOf(i))).onActivityResult(i, i2, intent);
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11669k.m56787e(strArr, "permissions");
        C11669k.m56787e(iArr, "grantResults");
        if (!this.f41616d.containsKey(Integer.valueOf(i))) {
            return false;
        }
        return ((C6566p) C10508b0.m52914f(this.f41616d, Integer.valueOf(i))).onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10572a(Context context, Activity activity, int i, C11665g gVar) {
        this(context, (i & 2) != 0 ? null : activity);
    }
}

package p041f;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0681a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p041f.C4246a;
import p243gd.C10340l;
import p243gd.C10346p;

/* renamed from: f.b */
/* compiled from: ActivityResultContracts.kt */
public final class C4248b extends C4246a<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final C4249a f23613a = new C4249a((C11665g) null);

    /* renamed from: f.b$a */
    /* compiled from: ActivityResultContracts.kt */
    public static final class C4249a {
        private C4249a() {
        }

        public /* synthetic */ C4249a(C11665g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo17616a(String[] strArr) {
            C11669k.m56787e(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            C11669k.m56786d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    /* renamed from: d */
    public Intent mo4184a(Context context, String[] strArr) {
        C11669k.m56787e(context, "context");
        C11669k.m56787e(strArr, "input");
        return f23613a.mo17616a(strArr);
    }

    /* renamed from: e */
    public C4246a.C4247a<Map<String, Boolean>> mo17611b(Context context, String[] strArr) {
        C11669k.m56787e(context, "context");
        C11669k.m56787e(strArr, "input");
        boolean z = true;
        if (strArr.length == 0) {
            return new C4246a.C4247a<>(C10508b0.m52913e());
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(C0681a.m3145a(context, strArr[i]) == 0)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12756f.m60449a(C10506a0.m52901b(strArr.length), 16));
        for (String a : strArr) {
            C10340l a2 = C10346p.m52247a(a, Boolean.TRUE);
            linkedHashMap.put(a2.mo33175c(), a2.mo33176d());
        }
        return new C4246a.C4247a<>(linkedHashMap);
    }

    /* renamed from: f */
    public Map<String, Boolean> mo4185c(int i, Intent intent) {
        if (i != -1) {
            return C10508b0.m52913e();
        }
        if (intent == null) {
            return C10508b0.m52913e();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C10508b0.m52913e();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return C10508b0.m52919k(C10530r.m52977C(C10515f.m52932h(stringArrayExtra), arrayList));
    }
}

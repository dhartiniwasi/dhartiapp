package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0681a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.t */
/* compiled from: TaskStackBuilder */
public final class C0679t implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f2201a = new ArrayList<>();

    /* renamed from: b */
    private final Context f2202b;

    /* renamed from: androidx.core.app.t$a */
    /* compiled from: TaskStackBuilder */
    public interface C0680a {
        Intent getSupportParentActivityIntent();
    }

    private C0679t(Context context) {
        this.f2202b = context;
    }

    /* renamed from: i */
    public static C0679t m3139i(Context context) {
        return new C0679t(context);
    }

    /* renamed from: b */
    public C0679t mo2993b(Intent intent) {
        this.f2201a.add(intent);
        return this;
    }

    /* renamed from: c */
    public C0679t mo2994c(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof C0680a ? ((C0680a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0648j.m2983a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f2202b.getPackageManager());
            }
            mo2995f(component);
            mo2993b(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: f */
    public C0679t mo2995f(ComponentName componentName) {
        int size = this.f2201a.size();
        try {
            Intent b = C0648j.m2984b(this.f2202b, componentName);
            while (b != null) {
                this.f2201a.add(size, b);
                b = C0648j.m2984b(this.f2202b, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2201a.iterator();
    }

    /* renamed from: j */
    public void mo2997j() {
        mo2998k((Bundle) null);
    }

    /* renamed from: k */
    public void mo2998k(Bundle bundle) {
        if (!this.f2201a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f2201a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0681a.m3156l(this.f2202b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2202b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}

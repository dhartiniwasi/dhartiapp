package p144t5;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;

/* renamed from: t5.k0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5568k0 extends ContextWrapper {

    /* renamed from: a */
    private Activity f28150a;

    public C5568k0(Application application) {
        super(application);
    }

    /* renamed from: a */
    public final void mo19872a(Activity activity) {
        this.f28150a = activity;
    }

    public final Object getSystemService(String str) {
        Activity activity = this.f28150a;
        if (activity != null) {
            return activity.getSystemService(str);
        }
        return super.getSystemService(str);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f28150a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        super.startActivity(intent);
    }
}

package p360tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1208j;
import p264io.flutter.embedding.android.C10627c;

/* renamed from: tb.b */
/* compiled from: ActivityControlSurface */
public interface C12589b {
    /* renamed from: b */
    void mo34092b(Bundle bundle);

    /* renamed from: c */
    void mo34093c();

    /* renamed from: d */
    void mo34094d(Intent intent);

    /* renamed from: e */
    void mo34095e(C10627c<Activity> cVar, C1208j jVar);

    /* renamed from: g */
    void mo34097g();

    /* renamed from: h */
    void mo34098h();

    boolean onActivityResult(int i, int i2, Intent intent);

    boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onSaveInstanceState(Bundle bundle);
}

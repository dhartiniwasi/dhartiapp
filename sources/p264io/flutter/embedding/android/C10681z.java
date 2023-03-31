package p264io.flutter.embedding.android;

import android.app.Activity;
import androidx.core.util.C0823a;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* renamed from: io.flutter.embedding.android.z */
/* compiled from: WindowInfoRepositoryCallbackAdapterWrapper */
public class C10681z {

    /* renamed from: a */
    final WindowInfoTrackerCallbackAdapter f41874a;

    public C10681z(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f41874a = windowInfoTrackerCallbackAdapter;
    }

    /* renamed from: a */
    public void mo33997a(Activity activity, Executor executor, C0823a<WindowLayoutInfo> aVar) {
        this.f41874a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    /* renamed from: b */
    public void mo33998b(C0823a<WindowLayoutInfo> aVar) {
        this.f41874a.removeWindowLayoutInfoListener(aVar);
    }
}

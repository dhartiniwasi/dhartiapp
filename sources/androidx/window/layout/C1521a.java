package androidx.window.layout;

import androidx.window.layout.SidecarWindowBackend;

/* renamed from: androidx.window.layout.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1521a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SidecarWindowBackend.WindowLayoutChangeCallbackWrapper f4369a;

    /* renamed from: b */
    public final /* synthetic */ WindowLayoutInfo f4370b;

    public /* synthetic */ C1521a(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
        this.f4369a = windowLayoutChangeCallbackWrapper;
        this.f4370b = windowLayoutInfo;
    }

    public final void run() {
        SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m62927accept$lambda0(this.f4369a, this.f4370b);
    }
}

package p146u0;

import android.view.ViewGroup;

/* renamed from: u0.l */
/* compiled from: Scene */
public class C5664l {

    /* renamed from: a */
    private ViewGroup f28362a;

    /* renamed from: b */
    private Runnable f28363b;

    /* renamed from: b */
    public static C5664l m33834b(ViewGroup viewGroup) {
        return (C5664l) viewGroup.getTag(C5657j.transition_current_scene);
    }

    /* renamed from: c */
    static void m33835c(ViewGroup viewGroup, C5664l lVar) {
        viewGroup.setTag(C5657j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    public void mo19997a() {
        Runnable runnable;
        if (m33834b(this.f28362a) == this && (runnable = this.f28363b) != null) {
            runnable.run();
        }
    }
}

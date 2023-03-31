package p196bd;

import android.view.Surface;
import kotlin.jvm.internal.C11669k;
import p344rd.C12439l;

/* renamed from: bd.b */
/* compiled from: Messages.kt */
public final class C6740b {
    /* renamed from: a */
    public static final <R> R m38653a(Surface surface, C12439l<? super Surface, ? extends R> lVar) {
        C11669k.m56787e(surface, "<this>");
        C11669k.m56787e(lVar, "block");
        try {
            return lVar.invoke(surface);
        } finally {
            surface.release();
        }
    }
}

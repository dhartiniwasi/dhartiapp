package p264io.flutter.embedding.android;

import android.view.textservice.SpellCheckerInfo;
import java.util.function.Predicate;

/* renamed from: io.flutter.embedding.android.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10643j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C10643j f41778a = new C10643j();

    private /* synthetic */ C10643j() {
    }

    public final boolean test(Object obj) {
        return ((SpellCheckerInfo) obj).getPackageName().equals("com.google.android.inputmethod.latin");
    }
}

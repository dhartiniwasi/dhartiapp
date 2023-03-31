package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Arrays;
import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.c */
/* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
public final class C8317c {

    /* renamed from: a */
    public static final C8317c f35362a = new C8317c();

    /* renamed from: com.onesignal.c$a */
    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    public interface C8318a {
        /* renamed from: a */
        void mo27635a();

        /* renamed from: b */
        void mo27636b();
    }

    /* renamed from: com.onesignal.c$b */
    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    static final class C8319b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8318a f35363a;

        C8319b(C8318a aVar) {
            this.f35363a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f35363a.mo27635a();
        }
    }

    /* renamed from: com.onesignal.c$c */
    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    static final class C8320c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8318a f35364a;

        C8320c(C8318a aVar) {
            this.f35364a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f35364a.mo27636b();
        }
    }

    private C8317c() {
    }

    /* renamed from: a */
    public final void mo27634a(Activity activity, String str, String str2, C8318a aVar) {
        C11669k.m56787e(activity, "activity");
        C11669k.m56787e(str, "titlePrefix");
        C11669k.m56787e(str2, "previouslyDeniedPostfix");
        C11669k.m56787e(aVar, "callback");
        String string = activity.getString(C8300a4.permission_not_available_title);
        C11669k.m56786d(string, "activity.getString(R.str…sion_not_available_title)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        C11669k.m56786d(format, "java.lang.String.format(this, *args)");
        String string2 = activity.getString(C8300a4.permission_not_available_message);
        C11669k.m56786d(string2, "activity.getString(R.str…on_not_available_message)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
        C11669k.m56786d(format2, "java.lang.String.format(this, *args)");
        new AlertDialog.Builder(activity).setTitle(format).setMessage(format2).setPositiveButton(C8300a4.permission_not_available_open_settings_option, new C8319b(aVar)).setNegativeButton(17039369, new C8320c(aVar)).show();
    }
}

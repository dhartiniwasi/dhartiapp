package com.startapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import com.startapp.networkTest.enums.AppCategoryTypes;

/* renamed from: com.startapp.j0 */
/* compiled from: Sta */
public class C9036j0 {

    /* renamed from: com.startapp.j0$a */
    /* compiled from: Sta */
    public class C9037a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ Activity f36976a;

        public C9037a(Activity activity) {
            this.f36976a = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C9036j0.m48699c(this.f36976a);
        }
    }

    /* renamed from: com.startapp.j0$b */
    /* compiled from: Sta */
    public class C9038b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ boolean f36977a;

        /* renamed from: b */
        public final /* synthetic */ Activity f36978b;

        public C9038b(boolean z, Activity activity) {
            this.f36977a = z;
            this.f36978b = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f36977a) {
                this.f36978b.finish();
            }
        }
    }

    /* renamed from: a */
    public static boolean m48697a(Context context) {
        if (Build.VERSION.SDK_INT < 21 || new Intent("android.settings.USAGE_ACCESS_SETTINGS").resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m48698b(Context context) {
        if (Build.VERSION.SDK_INT < 21 || ((AppOpsManager) context.getApplicationContext().getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getApplicationContext().getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m48699c(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
                intent.setFlags(411074560);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m48696a(Activity activity, int i, int i2, int i3, int i4, boolean z) {
        if (!m48697a((Context) activity)) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(i);
        builder.setCancelable(false);
        builder.setMessage(i2);
        builder.setPositiveButton(i3, new C9037a(activity));
        builder.setNegativeButton(i4, new C9038b(z, activity));
        builder.create().show();
        return true;
    }

    /* renamed from: a */
    public static AppCategoryTypes m48695a(int i) {
        AppCategoryTypes appCategoryTypes = AppCategoryTypes.Unknown;
        switch (i) {
            case -1:
                return AppCategoryTypes.Undefined;
            case 0:
                return AppCategoryTypes.Game;
            case 1:
                return AppCategoryTypes.Audio;
            case 2:
                return AppCategoryTypes.Video;
            case 3:
                return AppCategoryTypes.Image;
            case 4:
                return AppCategoryTypes.Social;
            case 5:
                return AppCategoryTypes.News;
            case 6:
                return AppCategoryTypes.Maps;
            case 7:
                return AppCategoryTypes.Productivity;
            default:
                return appCategoryTypes;
        }
    }
}

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C2076c;
import p033d5.C4141r;
import p180z4.C6362b;
import p180z4.C6368e;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    protected int f6011a = 0;

    /* renamed from: a */
    public static Intent m9047a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* renamed from: b */
    private final void m9048b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.f6011a = 1;
            } catch (ActivityNotFoundException e) {
                if (extras.getBoolean("notify_manager", true)) {
                    C2076c.m9223x(this).mo8038G(new C6362b(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(obj);
                    sb.append(".");
                    String sb2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", sb2, e);
                }
                this.f6011a = 1;
                finish();
            } catch (IntentSender.SendIntentException e2) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                finish();
            }
        } else {
            C6368e.m37415q().mo21781r(this, ((Integer) C4141r.m28221k(num)).intValue(), 2, this);
            this.f6011a = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f6011a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C2076c x = C2076c.m9223x(this);
                if (i2 == -1) {
                    x.mo8039a();
                } else if (i2 == 0) {
                    x.mo8038G(new C6362b(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f6011a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f6011a = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6011a = bundle.getInt("resolution");
        }
        if (this.f6011a != 1) {
            m9048b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f6011a);
        super.onSaveInstanceState(bundle);
    }
}

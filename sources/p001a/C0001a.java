package p001a;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p351sb.C12502a;

/* renamed from: a.a */
/* compiled from: RingtoneSetPlugin */
public class C0001a implements C12502a, C6556k.C6560c {

    /* renamed from: a */
    private C6556k f5a;

    /* renamed from: b */
    private Context f6b;

    /* renamed from: a */
    private boolean m2a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return true;
        }
        boolean canWrite = Settings.System.canWrite(this.f6b);
        if (canWrite || i < 23) {
            return canWrite;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + this.f6b.getPackageName()));
        intent.addFlags(268435456);
        this.f6b.startActivity(intent);
        return canWrite;
    }

    /* renamed from: c */
    private void m3c(String str, boolean z) {
        OutputStream openOutputStream;
        m2a();
        File file = new File(str);
        String type = this.f6b.getContentResolver().getType(Uri.fromFile(file));
        if (type == null) {
            type = ".mp3";
        }
        Log.e("from set ringtone ", "mime : " + type);
        if (file.exists()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", file.getAbsolutePath());
            contentValues.put("title", "KolpacinoRingtone");
            contentValues.put("mime_type", "audio/mpeg");
            contentValues.put("_size", Long.valueOf(file.length()));
            contentValues.put("artist", "Kolpaçino Sesleri");
            contentValues.put("is_ringtone", Boolean.valueOf(!z));
            contentValues.put("is_notification", Boolean.valueOf(z));
            contentValues.put("is_alarm", Boolean.TRUE);
            contentValues.put("is_music", Boolean.FALSE);
            Uri insert = this.f6b.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues);
            try {
                openOutputStream = this.f6b.getContentResolver().openOutputStream(insert);
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    bufferedInputStream.read(bArr, 0, length);
                    bufferedInputStream.close();
                    openOutputStream.write(bArr);
                    openOutputStream.close();
                    openOutputStream.flush();
                } catch (IOException unused) {
                }
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (z) {
                RingtoneManager.setActualDefaultRingtoneUri(this.f6b, 2, insert);
                return;
            } else {
                RingtoneManager.setActualDefaultRingtoneUri(this.f6b, 1, insert);
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: b */
    public void mo2b(Context context, C6539c cVar) {
        if (this.f5a == null) {
            this.f6b = context;
            C6556k kVar = new C6556k(cVar, "ringtone_set");
            this.f5a = kVar;
            kVar.mo22161e(this);
        }
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        mo2b(bVar.mo37292a(), bVar.mo37293b());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f5a.mo22161e((C6556k.C6560c) null);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        if (jVar.f30999a.equals("getPlatformVersion")) {
            dVar.success("Android " + Build.VERSION.RELEASE);
        }
        if (jVar.f30999a.equals("setRingtone")) {
            m3c((String) jVar.mo22156a("path"), false);
            dVar.success("success");
        } else if (jVar.f30999a.equals("setNotification")) {
            m3c((String) jVar.mo22156a("path"), true);
            dVar.success("success");
        } else {
            dVar.notImplemented();
        }
    }
}

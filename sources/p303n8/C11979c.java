package p303n8;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p246h7.C10412f;

/* renamed from: n8.c */
/* compiled from: PersistedInstallation */
public class C11979c {

    /* renamed from: a */
    private File f44910a;

    /* renamed from: b */
    private final C10412f f44911b;

    /* renamed from: n8.c$a */
    /* compiled from: PersistedInstallation */
    public enum C11980a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C11979c(C10412f fVar) {
        this.f44911b = fVar;
    }

    /* renamed from: a */
    private File m57790a() {
        if (this.f44910a == null) {
            synchronized (this) {
                if (this.f44910a == null) {
                    File filesDir = this.f44911b.mo33469m().getFilesDir();
                    this.f44910a = new File(filesDir, "PersistedInstallation." + this.f44911b.mo33472s() + ".json");
                }
            }
        }
        return this.f44910a;
    }

    /* renamed from: c */
    private JSONObject m57791c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(m57790a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: b */
    public C11981d mo36333b(C11981d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo36314d());
            jSONObject.put("Status", dVar.mo36318g().ordinal());
            jSONObject.put("AuthToken", dVar.mo36312b());
            jSONObject.put("RefreshToken", dVar.mo36317f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo36319h());
            jSONObject.put("ExpiresInSecs", dVar.mo36313c());
            jSONObject.put("FisError", dVar.mo36315e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f44911b.mo33469m().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(m57790a())) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: d */
    public C11981d mo36334d() {
        JSONObject c = m57791c();
        String optString = c.optString("Fid", (String) null);
        int optInt = c.optInt("Status", C11980a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", (String) null);
        String optString3 = c.optString("RefreshToken", (String) null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c.optLong("ExpiresInSecs", 0);
        return C11981d.m57794a().mo36326d(optString).mo36329g(C11980a.values()[optInt]).mo36324b(optString2).mo36328f(optString3).mo36330h(optLong).mo36325c(optLong2).mo36327e(c.optString("FisError", (String) null)).mo36323a();
    }
}

package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import p097n0.C5052a;
import p097n0.C5054c;
import p097n0.C5055d;
import p111p0.C5249b;
import p111p0.C5250c;

/* renamed from: androidx.room.j */
/* compiled from: SQLiteCopyOpenHelper */
class C1458j implements C5250c {

    /* renamed from: a */
    private final Context f4171a;

    /* renamed from: b */
    private final String f4172b;

    /* renamed from: c */
    private final File f4173c;

    /* renamed from: d */
    private final int f4174d;

    /* renamed from: e */
    private final C5250c f4175e;

    /* renamed from: f */
    private C1428a f4176f;

    /* renamed from: g */
    private boolean f4177g;

    C1458j(Context context, String str, File file, int i, C5250c cVar) {
        this.f4171a = context;
        this.f4172b = str;
        this.f4173c = file;
        this.f4174d = i;
        this.f4175e = cVar;
    }

    /* renamed from: a */
    private void m6824a(File file) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.f4172b != null) {
            readableByteChannel = Channels.newChannel(this.f4171a.getAssets().open(this.f4172b));
        } else if (this.f4173c != null) {
            readableByteChannel = new FileInputStream(this.f4173c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4171a.getCacheDir());
        createTempFile.deleteOnExit();
        C5055d.m31776a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    /* renamed from: f */
    private void m6825f() {
        String databaseName = getDatabaseName();
        File databasePath = this.f4171a.getDatabasePath(databaseName);
        C1428a aVar = this.f4176f;
        C5052a aVar2 = new C5052a(databaseName, this.f4171a.getFilesDir(), aVar == null || aVar.f4076j);
        try {
            aVar2.mo18969b();
            if (!databasePath.exists()) {
                m6824a(databasePath);
                aVar2.mo18970c();
            } else if (this.f4176f == null) {
                aVar2.mo18970c();
            } else {
                try {
                    int c = C5054c.m31775c(databasePath);
                    int i = this.f4174d;
                    if (c == i) {
                        aVar2.mo18970c();
                    } else if (this.f4176f.mo5558a(c, i)) {
                        aVar2.mo18970c();
                    } else {
                        if (this.f4171a.deleteDatabase(databaseName)) {
                            try {
                                m6824a(databasePath);
                            } catch (IOException e) {
                                Log.w("ROOM", "Unable to copy database file.", e);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar2.mo18970c();
                    }
                } catch (IOException e2) {
                    Log.w("ROOM", "Unable to read database version.", e2);
                    aVar2.mo18970c();
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException("Unable to copy database file.", e3);
        } catch (Throwable th) {
            aVar2.mo18970c();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5632b(C1428a aVar) {
        this.f4176f = aVar;
    }

    public synchronized void close() {
        this.f4175e.close();
        this.f4177g = false;
    }

    public String getDatabaseName() {
        return this.f4175e.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f4175e.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: x0 */
    public synchronized C5249b mo5636x0() {
        if (!this.f4177g) {
            m6825f();
            this.f4177g = true;
        }
        return this.f4175e.mo5636x0();
    }
}

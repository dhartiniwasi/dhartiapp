package p097n0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.C1450h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p111p0.C5249b;
import p111p0.C5256e;

/* renamed from: n0.c */
/* compiled from: DBUtil */
public class C5054c {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m31773a(C5249b bVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor z0 = bVar.mo19241z0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (z0.moveToNext()) {
            try {
                arrayList.add(z0.getString(0));
            } catch (Throwable th) {
                z0.close();
                throw th;
            }
        }
        z0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.mo19231C("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: b */
    public static Cursor m31774b(C1450h hVar, C5256e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor q = hVar.mo5605q(eVar, cancellationSignal);
        if (!z || !(q instanceof AbstractWindowedCursor)) {
            return q;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) q;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C5053b.m31771a(abstractWindowedCursor) : q;
    }

    /* renamed from: c */
    public static int m31775c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                fileChannel.close();
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }
}

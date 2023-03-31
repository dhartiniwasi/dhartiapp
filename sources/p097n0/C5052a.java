package p097n0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: n0.a */
/* compiled from: CopyLock */
public class C5052a {

    /* renamed from: e */
    private static final Map<String, Lock> f26443e = new HashMap();

    /* renamed from: a */
    private final File f26444a;

    /* renamed from: b */
    private final Lock f26445b;

    /* renamed from: c */
    private final boolean f26446c;

    /* renamed from: d */
    private FileChannel f26447d;

    public C5052a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f26444a = file2;
        this.f26445b = m31768a(file2.getAbsolutePath());
        this.f26446c = z;
    }

    /* renamed from: a */
    private static Lock m31768a(String str) {
        Lock lock;
        Map<String, Lock> map = f26443e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: b */
    public void mo18969b() {
        this.f26445b.lock();
        if (this.f26446c) {
            try {
                FileChannel channel = new FileOutputStream(this.f26444a).getChannel();
                this.f26447d = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: c */
    public void mo18970c() {
        FileChannel fileChannel = this.f26447d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f26445b.unlock();
    }
}

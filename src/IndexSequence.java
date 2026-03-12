
public class IndexSequence implements IndexIF {

    protected SequenceIF<Pair_W_SeqPSF> index;

    @Override
    public Seq_PSF retrieveIndex(String p) {
        return null;
    }

    @Override
    public void insertIndex(String p, String doc_id, int freq) {

    }

    @Override
    public IteratorIF<Pair_W_SeqPSF> prefixIterator(String prefix) {
        return null;
    }
}

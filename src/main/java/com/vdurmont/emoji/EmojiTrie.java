package com.vdurmont.emoji;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmojiTrie {

    private final Node root = new Node();

    final int maxDepth;

    public EmojiTrie(Collection<Emoji> emojis) {
        int maxDepth = 0;
        for (Emoji emoji : emojis) {
            Node tree = root;
            char[] chars = emoji.getUnicode().toCharArray();
            maxDepth = Math.max(maxDepth, chars.length);
            for (char c : chars) {
                if (!tree.hasChild(c)) {
                    tree.addChild(c);
                }
                tree = tree.getChild(c);
            }
            tree.setEmoji(emoji);
        }
        this.maxDepth = maxDepth;
    }

    /**
     * Checks if sequence of chars contain an emoji.
     *
     * @param sequence Sequence of char that may contain emoji in full or
     * partially.
     *
     * @return
     * &lt;li&gt;
     *   Matches.EXACTLY if char sequence in its entirety is an emoji
     * &lt;/li&gt;
     * &lt;li&gt;
     *   Matches.POSSIBLY if char sequence matches prefix of an emoji
     * &lt;/li&gt;
     * &lt;li&gt;
     *   Matches.IMPOSSIBLE if char sequence matches no emoji or prefix of an
     *   emoji
     * &lt;/li&gt;
     */
    public Matches isEmoji(char[] sequence) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if the sequence of chars within the given bound indices contain an emoji.
     * @see #isEmoji(char[])
     */
    public Matches isEmoji(char[] sequence, int start, int end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Finds Emoji instance from emoji unicode
     * @param unicode unicode of emoji to get
     * @return Emoji instance if unicode matches and emoji, null otherwise.
     */
    public Emoji getEmoji(String unicode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Emoji getEmoji(char[] sequence, int start, int end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum Matches {

        EXACTLY, POSSIBLY, IMPOSSIBLE;

        public boolean exactMatch() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public boolean impossibleMatch() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private class Node {

        private Map<Character, Node> children = new HashMap<Character, Node>();

        private Emoji emoji;

        private void setEmoji(Emoji emoji) {
            this.emoji = emoji;
        }

        private Emoji getEmoji() {
            return emoji;
        }

        private boolean hasChild(char child) {
            return children.containsKey(child);
        }

        private void addChild(char child) {
            children.put(child, new Node());
        }

        private Node getChild(char child) {
            return children.get(child);
        }

        private boolean isEndOfEmoji() {
            return emoji != null;
        }
    }
}

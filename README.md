# cs515-001-s20-grimreapers-jedit

**First Change:**

Currently the left side of the status bar of jEdit reports: the line number containing the caret, the column position of the caret,
the character offset of the caret from the beginning of the file, and the number of characters in the file. This change request implemented additional features to 
show the word offset of the caret from the beginning of the file and the number of words in the file. The new options were added to the Status Bar preference dialog 
as check boxes.

**Second Change:**
In jEdit, the HyperSearch feature should listand highlight all occurrences of the search string, however it only highlights the first occurence of the serach string
found. This change fixed the HyperSearch feature, so that its list of results highlights all occurrences of a search string.

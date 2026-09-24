Class Book{
    private String id;
    private String title;
    public Book(String id,String title){
        this.id = id;
        this.title = title;
        }
        public String getId(){
        return id;
        }
        public String getTitle(){
        return title;
        }
public boolean containsTitle(String keyword) {
        return title.contains(keyword);
        }
public boolean hasTitle() {
        return title != null && !title.isEmpty();
        }
}
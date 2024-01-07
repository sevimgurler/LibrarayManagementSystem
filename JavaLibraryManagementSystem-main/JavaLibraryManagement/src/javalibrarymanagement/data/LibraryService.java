package javalibrarymanagement.data;

import java.util.ArrayList;
import javalibrarymanagement.data.dao.*;
import javalibrarymanagement.data.daoImpl.*;
import javalibrarymanagement.data.model.Annoucement;
import javalibrarymanagement.data.model.Author;
import javalibrarymanagement.data.model.Book;
import javalibrarymanagement.data.model.BookIssue;
import javalibrarymanagement.data.model.BorrowRequest;
import javalibrarymanagement.data.model.Categories;
import javalibrarymanagement.data.model.Departmant;
import javalibrarymanagement.data.model.Event;
import javalibrarymanagement.data.model.Librarian;
import javalibrarymanagement.data.model.Location;
import javalibrarymanagement.data.model.Member;
import javalibrarymanagement.data.model.Publisher;

public class LibraryService {
    private static LibraryService instance;
    private final BookDao bookDao;
    private final AnnoucementDao annoucementDao;
    private final BookIssueDao bookIssueDao;
    private final BorrowRequestDao borrowRequestDao;
    private final CategoryDao categoryDao;
    private final EventDao eventDao;
    private final MemberDao memberDao;
    private final LibrarianDao librarianDao;
    private final DepartmantDao departmantDao;
    private final AuthorDao authorDao;
    private final LocationDao locationDao;
    private final PublisherDao publisherDao;
    
    public LibraryService() {
        bookDao = BookDaoImpl.getInstance();
        annoucementDao = AnnoucementDaoImpl.getInstance();
        bookIssueDao = BookIssueDaoImpl.getInstance();
        borrowRequestDao = BorrowRequestDaoImpl.getInstance();
        categoryDao = CategoryDaoImpl.getInstance();
        eventDao = EventDaoImpl.getInstance();
        memberDao = MemberDaoImpl.getInstance();
        librarianDao = LibrarianDaoImpl.getInstance();
        departmantDao = DepartmantDaoImpl.getInstance();
        authorDao = AuthorDaoImpl.getInstance();
        locationDao = LocationDaoImpl.getInstance();
        publisherDao = PublisherDaoImpl.getInstance();
    }
    
    public static synchronized LibraryService getInstance(){
        if (instance == null) {
            instance = new LibraryService();
        }
        return instance;
    }

    //Annoucements
    public ArrayList<Annoucement> getAllAnnoucements(){
        return annoucementDao.getAllAnnoucements();
    }
    
    public Boolean deleteAnnoucements(Annoucement annoucement){
        return annoucementDao.deleteAnnoucements(annoucement);
    }
    
    public Boolean updateAnnoucements(Annoucement annoucement){
        return annoucementDao.updateAnnoucements(annoucement);
    }
    
    public Boolean addAnnoucements(Annoucement annoucement, int librarianID){
        return annoucementDao.addAnnoucements(annoucement, librarianID);
    }
    
    public ArrayList<Annoucement> searchWithNameAnnoucement(String name){
        return annoucementDao.searchWithName(name);
    }
    
    //Books
    public ArrayList<Book> getAllBooks(){
        return bookDao.getAllBooks();
    }
    
    public ArrayList<Book> searchWithName(String searchKey){
        return bookDao.searchWithName(searchKey);        
    }
    
    public ArrayList<Book> searchWithISBN(String searchKey){
        return bookDao.searchWithISBN(searchKey);       
    }
    
    public ArrayList<Book> searchWithAuthor(String searchKey){
        return bookDao.searchWithAuthor(searchKey);       
    }
    
    public ArrayList<Book> searchWithCategory(String searchKey){
        return bookDao.searchWithCategory(searchKey);       
    }
    
    public ArrayList<Book> searchWithPublisher(String searchKey){
        return bookDao.searchWithPublisher(searchKey);       
    }
    
    public Boolean addBook(String ISBN, String name, String year, String edition, int copies, int location, int category, int publisher, int author){
        return bookDao.addBook(ISBN, name, year, edition, copies, location, category, publisher, author);
    }
    
    public Boolean updateBook(String ISBN, String name, String year, String edition, int copies, int location, int category, int publisher, int author){
        return bookDao.updateBook(ISBN, name, year, edition, copies, location, category, publisher, author);
    }
    
    public Boolean deleteBook(String ISBN){
        return bookDao.deleteBook(ISBN);
    }
    
    //Issues
     public ArrayList<BookIssue> getMyIssues(Member member){
         return bookIssueDao.getMyIssues(member);
     }
     
    public Boolean returnBook(String returnDate, String memberID, String bookISBN,int bookCopy){
        return bookIssueDao.returnBook(returnDate, memberID, bookISBN, bookCopy);
    }
    
    public ArrayList<BookIssue> getAllIssues(){
        return bookIssueDao.getAllIssues();
    }
    
    public Boolean createIssue(String bookISBN,String memberID,int librarianID,String issueDate,String status,int bookCopy){
        return bookIssueDao.createIssue(bookISBN, memberID, librarianID, issueDate, status, bookCopy);
    }
         
    //Request
    public ArrayList<BorrowRequest> getAllRequests(){
        return borrowRequestDao.gelAllRequests();
    }
    
    public ArrayList<BorrowRequest> getMemberRequests(String memberID){
        return borrowRequestDao.getMemberRequests(memberID);
    }
    
    public Boolean isSelectedBookRequested(Member member, String bookID){
        return borrowRequestDao.isSelectedBookRequested(member, bookID);
    }
    
    public Boolean createBorrowRequest(String bookID, Member member, String requestDate){
        return borrowRequestDao.createBorrowRequest(bookID, member, requestDate);
    }
    
    public Boolean deleteBorrowRequestFromUser(String bookID, Member member){
        return borrowRequestDao.deleteBorrowRequestFromUser(bookID, member);
    }
        
    public Boolean approveRequest(String memberID, String bookISBN){
        return borrowRequestDao.approveRequest(memberID, bookISBN);
    }
    
    public Boolean rejectRequest(String memberID, String bookISBN){
        return borrowRequestDao.rejectRequest(memberID, bookISBN);
    }
    
    public Boolean closeRequest(String memberID, String bookISBN){
        return borrowRequestDao.closeRequest(memberID, bookISBN);
    }
    
    //Categories
    public ArrayList<Categories> getAllCategories(){
        return categoryDao.getAllCategories();
    }
    
    public Boolean addCategory(String categoryName){
        return categoryDao.addCategory(categoryName);
    }
    
    //Departmants
    public ArrayList<Departmant> getAllDepartmants(){
        return departmantDao.getAllDepartmants();
    }
    
    //Events
    public ArrayList<Event> getAllEvents(){
        return eventDao.getAllEvents();
    }
    
    public Boolean deleteEvent(Event event){
        return eventDao.deleteEvent(event);
    }
    
    public Boolean updateEvent(Event event){
        return eventDao.updateEvent(event);
    }
    
    public Boolean addEvent(Event event, String librarianID){
        return eventDao.addEvent(event, librarianID);
    }
    
        
    public ArrayList<Event> searchWithNameEvents(String name){
        return eventDao.searchWithName(name);
    }
    
    public ArrayList<Event> searchWithTypeEvents(String type){
        return eventDao.searchWithType(type);
    }
    
    //Members
    public ArrayList<Member> getAllMembers(){
        return memberDao.getAllMembers();
    }
    
    public Member searchAcademician(String username, String password){
        return memberDao.searchAcademician(username, password);
    }
    
    public Member searchStudent(String username, String password){
        return memberDao.searchStudent(username, password);
    }
    
    public ArrayList<Member> searchMembersWithName(String searchKeyword){
        return memberDao.searchMembersWithName(searchKeyword);
    }

    public ArrayList<Member> searchMembersWithID(String searchKeyword){
        return memberDao.searchMembersWithID(searchKeyword);
    }
    
    public Boolean addMember(String memberID, String memberName, String memberSurname, String memberPhone, String memberAddress, String memberMail, String memberUsername, String memberPassword, int bookLimit, int departmantID, String studentNumber, int grade, String title, String userType) {
        return memberDao.addMember(memberID, memberName, memberSurname, memberPhone, memberAddress, memberMail, memberUsername, memberPassword, bookLimit, departmantID, studentNumber, grade, title, userType); 
    }
    
    public Boolean addAcademician(String memberID, String title){
        return memberDao.addAcademician(memberID, title);
    }

    public Boolean addStudent(String memberID, String studentNumber, int grade){
        return memberDao.addStudent(memberID, studentNumber, grade);
    }
    
    public Boolean updateMember(String memberID, String memberName, String memberSurname, String memberPhone, String memberAddress, String memberMail, String memberUsername, int departmantID, String studentNumber, int grade, String title, String userType){
        return memberDao.updateMember(memberID, memberName, memberSurname, memberPhone, memberAddress, memberMail, memberUsername, departmantID, studentNumber, grade, title, userType);
    }
    
    public Boolean updateAcademician(String memberID, String title){
        return memberDao.updateAcademician(memberID, title);
    }
    
    public Boolean updateStudent(String memberID, String studentNumber, int grade){
        return memberDao.updateStudent(memberID, studentNumber, grade);
    }
    
    public Boolean deleteMember(String memberID, String memberType){
        return memberDao.deleteMember(memberID, memberType);
    }
    
    //Librarian
    public Librarian searchLibrarian(String username, String password){
         return librarianDao.searchLibrarian(username, password);
     }
    
    //Author
    public ArrayList<Author> getAllAuthors(){
        return authorDao.getAllAuthors();
    }
    
    public Boolean addAuthor(String name, String surname){
        return authorDao.addAuthor(name, surname);
    }
    
    //Location
    public ArrayList<Location> getAllLocations(){
        return locationDao.getAllLocations();
    }
    
    public Boolean addLocation(int shelfNo, String shelfName, int floorNo){
        return locationDao.addLocation(shelfNo, shelfName, floorNo);
    }
    
    //Publisher
    public ArrayList<Publisher> getAllPublisher(){
        return publisherDao.getAllPublisher();
    }
    
    public Boolean addPublisher(String publisherName, String language){
        return publisherDao.addPublisher(publisherName, language);
    }
    
    
}

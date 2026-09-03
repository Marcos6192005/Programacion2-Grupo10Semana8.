import com.sv.group10.socialMedia.model.Customer;

void main(String[] args) {
    Customer customer1 = new Customer("C1", "Pancho", 23, "male", "pacho@gmail.com", "75221133");
    String result = customer1.getCustomerInfo();
    System.out.println(result);
}
import re
import time
from playwright.sync_api import Playwright, sync_playwright, expect


def run(playwright: Playwright) -> None:
    browser = playwright.chromium.launch(headless=False, slow_mo=1000)
    context = browser.new_context()
    page = context.new_page()
    
    
    
    #-------------------------------- TC_Contact_06	--------------------------------#
    
    """
    TC_Contact_06	
    Kiểm tra chức năng gửi liên hệ (Contact Us) thành công với file đính kèm.	
        1. Truy cập trang chủ http://automationexercise.com
		2. Click nút "Contact us" trên thanh menu.
		3. Nhập Tên vào ô Name (Ví dụ: "Trương Tấn Đạt").
		4. Nhập Email hợp lệ vào ô Email.
		5. Nhập Tiêu đề và Nội dung vào ô Subject và Message.
		6. Click nút "Choose File" và chọn 1 file ảnh từ máy tính.
		7. Click nút "Submit".
		8. Click nút "OK" trên hộp thoại cảnh báo (Alert Popup).
		9.Kiểm tra varify "Success! Your details have been submitted successfully." đã submit thành công chưa
    """
    
    
    # TC_Contact_06_1: Truy cập trang chủ "http://automationexercise.com
    page.goto("https://automationexercise.com/")
    
    print("\n[SUCCESS] Truy cập thành công")
    
    print("\n[Running] TC_Contact_06: Contact Us Form...")

    # TC_Contact_06_2. Click nút "Contact us" trên thanh menu.
    page.get_by_role("link", name=" Contact us").click()
    
    page.mouse.wheel(0, 500) 
    time.sleep(3)            
    
    print("\n[RUNNING] Bắt đầu điền thông tin")
    
    # Bắt đầu điền thông tin
    # TC_Contact_06_3. Nhập Tên vào ô Name (Ví dụ: "Trương Tấn Đạt").
    page.get_by_role("textbox", name="Name").click()
    page.get_by_role("textbox", name="Name").fill("Trương Tấn Đạt")
    
    # TC_Contact_06_4. Nhập Email hợp lệ vào ô Email.
    page.get_by_role("textbox", name="Email", exact=True).click()
    page.get_by_role("textbox", name="Email", exact=True).fill("22130037@st.hcmuaf.edu.vn")
    
    # TC_Contact_06_5. Nhập Tiêu đề và Nội dung vào ô Subject và Message.
    page.get_by_role("textbox", name="Subject").click()
    page.get_by_role("textbox", name="Subject").press("CapsLock")
    page.get_by_role("textbox", name="Subject").fill("KIỂM TRA CHỨC NĂNG TEST CONTACT US")
    page.get_by_role("textbox", name="Your Message Here").click()
    page.get_by_role("textbox", name="Your Message Here").fill("")
    page.get_by_role("textbox", name="Your Message Here").fill("Hello\nA \nb \nC")
    
    print("\n[SUCCESS] Nhập thông tin thành công!")

    # TC_Contact_06_6. Click nút "Choose File" và chọn 1 file ảnh từ máy tính.
    page.locator("input[name=\"upload_file\"]").set_input_files("D:\\Testing\\HìnhTestContactUs.png")
    
    print("\n[SUCCESS] Tải File thành công")
    
    print("\n[RUNNING] Bắt đầu nhấn submit")
        
    # TC_Contact_06_8. Click nút "OK" trên hộp thoại cảnh báo (Alert Popup).
    page.once("dialog", lambda dialog: dialog.accept())
    
    
    # TC_Contact_06_7. Click nút "Submit".
    page.get_by_role("button", name="Submit").click()
    
    print("\n[SUCCESS] Bắt đầu nhấn submit THÀNH CÔNG!")
    
    # TC_Contact_06_9. Kiểm tra varify "Success! Your details have been submitted successfully." đã submit thành công chưa
    try:
        expect(page.locator(".status")).to_contain_text("Success! Your details have been submitted successfully")
        print("  -> TC_Contact_06 KẾT QUẢ: PASSED (Gửi liên hệ thành công)")
    except:
        print("  -> TC_Contact_06 KẾT QUẢ: FAILED (Không thấy thông báo thành công)")
        
    time.sleep(3)
        
        
        
    
    #-------------------------------- TC13_TC_Product_13 --------------------------------#
    """
    TC_Product_13	
    Kiểm tra số lượng sản phẩm hiển thị trong giỏ hàng (Verify Product quantity in Cart).	
        1. Truy cập trang chủ http://automationexercise.com
		2. Click nút "View Product" tại sản phẩm bất kỳ (Ví dụ: Blue Top).
		3. Tại trang chi tiết sản phẩm, xóa số '1' và nhập "4" vào ô Quantity.
		4. Click nút "Add to cart".
		5. Click nút "View Cart" trên popup hiện ra.
		6. Kiểm tra con số hiển thị tại cột Quantity của sản phẩm đó trong giỏ hàng.
    """
    
    print("\n[Running] TC_Product_13: Verify Product Quantity...")
    
    # TC_Product_13_1. Truy cập trang chủ http://automationexercise.com
    page.goto("https://automationexercise.com/")
    
    print("\n[SUCCESS] Truy cập lại thành công")
    
    # TC_Product_13_2. Click nút "View Product" tại sản phẩm bất kỳ (Ví dụ: Blue Top).
    page.locator(".choose > .nav > li > a").first.click()
    
    print("\n[SUCCESS] Chọn sản phẩm bất kỳ (ví dụ sản phẩm đầu tiên --> Blue top )")
    
    # TC_Product_13_3. Tại trang chi tiết sản phẩm, xóa số '1' và nhập "4" vào ô Quantity.
    page.locator("#quantity").fill("4")
    
    print("\n[SUCCESS] Tăng sản phẩm số lương 4 thành công")
    
    # TC_Product_13_4. Click nút "Add to cart".
    page.get_by_role("button", name=" Add to cart").click()
    
    print("\n[SUCCESS] Thêm giỏ hàng")
    
    # TC_Product_13_5. Click nút "View Cart" trên popup hiện ra.
    page.get_by_role("link", name="View Cart").click()
    
    print("\n[SUCCESS] Chuyển trang danh sách trong giỏ hàng")
    
    # TC_Product_13_6. Kiểm tra con số hiển thị tại cột Quantity của sản phẩm đó trong giỏ hàng.
    quantity_displayed = page.locator("tr >> .cart_quantity button").inner_text()
    
    print("\n[RUNNING] Kiểm tra sản phẩm đang hiển thị")
    
    if quantity_displayed == "4":
        print(f"  -> TC2 KẾT QUẢ: PASSED (Số lượng trong giỏ là {quantity_displayed})")
    else:
        print(f"  -> TC2 KẾT QUẢ: FAILED (Mong đợi: 4 - Thực tế: {quantity_displayed})")

    time.sleep(3)
    
    context.close()
    browser.close()


with sync_playwright() as playwright:
    run(playwright)

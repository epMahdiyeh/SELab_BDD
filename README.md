# SELab_BDD
تصاویری از مراحل build پروژه و اجرای تست‌ها:

<img width="873" alt="1" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/5883a4e4-b103-428a-bda6-112aa4d67eda">

<img width="662" alt="2" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/bbf5fa77-3ca1-4d7c-93c7-731896906014">

<img width="574" alt="3" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/07f57617-a58b-495e-bb04-a035abd7cf89">

<img width="680" alt="4" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/d793f8b7-de30-46ab-b702-91ee49124b21">

<img width="744" alt="5" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/d7c934cd-0177-4710-a9f2-998ae829748a">



مرحله اجرای Outline Scenario برای جمع دو عدد:

پس از اجرای RunnerTest برخی تست‌ها به مشکل undefined برمی‌خورند. این موارد تست کدامند؟ علت بروز مشکل چیست؟

تست‌هایی که شامل اعداد منفی می‌شوند علت ایجاد خطای undefined هستند و رجکس مربوطه فقط اعداد مثبت را پشتیبانی می‌کند و درصورت استفاده از اعداد منفی خروجی صحیح نخواهیم داشت. برای حل این مشکل می‌توان رجکس مربوط به اعداد را بصورت (+d\\?-) تغییر داد تا اعداد منفی را نیز دربرگیرد.

پاس نشدن تست‌های حاوی اعداد منفی:

<img width="580" alt="6" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/87d58ce7-fcc9-4d03-8322-0cf360359081">

--------------------------------------

پیاده‌سازی محاسبات جذر حاصل از تقسیم دو عدد صحیح:

ابتدا فایلی مشابه calculator.feature، به نام sqrt.feature ساخته شد که در آن امکان تعریف سناریوی معمولی و سناریوی Outline وجود داشته باشد.

<img width="465" alt="9" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/e9a0d8b7-f5d2-45c4-98bf-e23d7aadb3fe">

سپس در فایل Calculator.java در مسیر src -> main -> java -> calculator به تعریف تابعی برای محاسبه جذر a/b پرداختیم.

<img width="531" alt="10" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/e561ddd8-b18d-4280-895b-eedb95309240">

و درنهایت در فایل MyStepdefs.java با استفاده از تگ‌های before, given, when, then فرمت ورود عددها را مشخص کرده و به تست نمونه‌های موجود در فایل sqrt میپردازیم:

<img width="488" alt="11" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/6daf9a5f-d5b7-487c-8eef-c91505c6b4fd">

<img width="465" alt="9" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/b7c07ffc-65b9-4a71-ab19-d28bf9ac2fbd">


در اینجا مشاهده می‌شود که هر 5 تست با موفقیت پاس می‌شوند:

<img width="552" alt="7" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/76885194-1cca-4c93-81c3-6cd2dbd8d36d">

حال حاصل یکی از خروجی‌ها را نادرست وارد می‌کنیم و به ارور برمیخوریم:


<img width="707" alt="8" src="https://github.com/epMahdiyeh/SELab_BDD/assets/62205305/beb64ba6-dea2-4c1b-b97a-d730171112bb">





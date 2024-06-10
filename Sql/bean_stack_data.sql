create table if not exists bean_stack_data(
stack_code varchar(255) not null,
stack_name varchar(255) null,
localenvironment varchar(255) null,
tradeenvironment varchar(255) null,
short_description varchar(255) null,
multi_stack_option varchar(255) null,
stack_params varchar(255) null,
upload_version Integer null,
launch_environment varchar(255) null,
manage_environment varchar(255) null,
status varchar(255) null,
constraint bean_stack_data_pk primary key(stack_code));
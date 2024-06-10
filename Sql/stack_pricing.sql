create table if not exists stack_pricing(
record_key Integer not null,
pricing_console_code Integer null,
pricing_console_code_position varchar(255) null,
pricing_console_code_length varchar(255) null,
console_tools varchar(255) null,
cli_tools varchar(255) null,
api_gateway_enabled char null,
total_lambdas varchar(255) null,
base_image varchar(255) null,
memory varchar(255) null,
cpus varchar(255) null,
gpus varchar(255) null,
avilability_zones varchar(255) null,
multi_region_support varchar(255) null,
constraint stack_pricing_pk primary key(record_key));